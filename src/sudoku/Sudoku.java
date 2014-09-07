package sudoku;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sudoku {

 
    
    public static void main(String[] args) {
        
        int numbers[];
        
        
        SudokuWindow window = new SudokuWindow();
        window.setVisible(true);
        
        StopWatch timer = new StopWatch();
        
        
        
        
        synchronized(window){
            try {
                window.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Sudoku.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        while(true){
            
            
            numbers = window.returnValues();
        
            if(numbers[0] == 1)
            {
            
        
        
            FullBoard board = new FullBoard(numbers);
            Block block = new Block(board.returnBlock(), board.returnValue());
            Col col = new Col(board.returnCol(), board.returnValue());
            Row row = new Row(board.returnRow(), board.returnValue());
            
          

            //Start Solution Code
            //This is a brute force algorithm
            
            timer.start();
         
            int position = 1;
            int tempVal = 1;
            while (position > 0 && position < 82 && numbers[0] == 1)
            {
            
            
            if(board.checkPerm(position))
            {
                if(col.checkCol(board.returnCol(position), tempVal) && row.checkRow(board.returnRow(position), tempVal) && 
                   block.checkBlo(board.returnBlock(position), tempVal) && tempVal < 10)
                {
                            board.setValue(position, tempVal);
                            col.setValue(board.returnCol(position), tempVal);
                            row.setValue(board.returnRow(position), tempVal);
                            block.setValue(board.returnBlock(position), tempVal);
                            window.setValue(tempVal,position);
                            
                            position++;
                            
                            
                            tempVal = 1;
                            
                }
                else
                {
                    tempVal++;
                    
                }
               
                if(tempVal > 9)
                {
                    col.remValue(board.returnCol(position), board.returnValue(position));
                    row.remValue(board.returnRow(position), board.returnValue(position));
                    block.remValue(board.returnBlock(position), board.returnValue(position));
                    board.setValue(position, 0);
                    window.setValue(0,position);
                    position--;
                    
                    while(!board.checkPerm(position))
                    {
                        position--;
                    }
                    tempVal = board.returnValue(position) + 1;
                    
                    col.remValue(board.returnCol(position), board.returnValue(position));
                    row.remValue(board.returnRow(position), board.returnValue(position));
                    block.remValue(board.returnBlock(position), board.returnValue(position));
                    board.setValue(position, 0);
                    window.setValue(0,position);
                    
                }
            }
            else
            {
                position++;
            }
            
            }
            
            timer.stop();
            if (numbers[0] == 1){
            window.setTime(timer.getElapsedTime());
            }
        }
        
        
        synchronized(window){
            try {
                window.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Sudoku.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        }
        
                
    }
}
