/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nick
 */
public class FullBoard {
    private int value[] = new int [82];
    private int col[] = new int [82];
    private int row[] = new int [82];
    private int block[] = new int [82];
    private int perm[] = new int [82];
    
    public FullBoard(int value[])
    {
        System.arraycopy(value, 1, this.value, 1, 81);
        
        int thisRow = 1;
        int place = 1;
        for(int temp = 1; temp < 10; temp++)
        {
           for(int temp2 = 1; temp2 < 10; temp2++)
           {
           row[place++] = thisRow;
           }
        thisRow++;    
        }
        
        int thisCol = 1;
        place = 1;
        for(int temp = 1; temp < 10; temp++)
        {
           for(int temp2 = 1; temp2 < 10; temp2++)
           {
           col[place++] = thisCol++;
           }
        thisCol = 1;
            
        }
        
        place = 1;
        int thisBlock = 1;
        for(int temp = 1; temp < 4; temp++)
        {
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
             for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock = 1;   
        }
        
        for(int temp = 1; temp < 4; temp++)
        {
            thisBlock = 4;
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
             for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
               
        }
        
        
        for(int temp = 1; temp < 4; temp++)
        {
            thisBlock = 7;
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
            for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }
            thisBlock++;
            
             for(int temp2 = 1; temp2 < 4; temp2++)
            {
                block[place++] = thisBlock;  
            }   
        }
        
        for(int temp = 1; temp < 82; temp++)
        {
            if(value[temp] == 0)
            {
                perm[temp] = 0;
            }
            else
            {
                perm[temp] = 1;
            }
        }
        
    }
    
    
    //Getters
    public int[] returnRow()
    {
        return row;
    }
    
    public int[] returnCol()
    {
        return col;
    }
    public int[] returnBlock()
    {
        return block;
    }
    public int[] returnValue()
    {
        return value;
    }
    
    public int returnRow(int space)
    {
        return row[space];
    }
    
    public int returnCol(int space)
    {
        return col[space];
    }
    public int returnBlock(int space)
    {
        return block[space];
    }
    public int returnValue(int space)
    {
        return value[space];
    }
    
    public boolean checkPerm(int space)
    {
        return (perm[space] == 0);
    }
    
    //Setters
    public void setValue(int space, int val)
    {
        value[space] = val;
    }
}
