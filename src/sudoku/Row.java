/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nick
 */
public class Row {
    private int[] row1 = new int[11];
    private int[] row2 = new int[11];
    private int[] row3 = new int[11];
    private int[] row4 = new int[11];
    private int[] row5 = new int[11];
    private int[] row6 = new int[11];
    private int[] row7 = new int[11];
    private int[] row8 = new int[11];
    private int[] row9 = new int[11];
    
    public Row(int rowNum[], int val[])
    {
        for(int temp = 1; temp < 82; temp++)
        {
            switch (rowNum[temp]){
                case 1: row1[val[temp]] = 1;
                        break;
                case 2: row2[val[temp]] = 1;
                        break;
                case 3: row3[val[temp]] = 1;
                        break;
                case 4: row4[val[temp]] = 1;
                        break;
                case 5: row5[val[temp]] = 1;
                        break;
                case 6: row6[val[temp]] = 1;
                        break;
                case 7: row7[val[temp]] = 1;
                        break;
                case 8: row8[val[temp]] = 1;
                        break;
                case 9: row9[val[temp]] = 1;
                        break;
            }
                
        }
        
        
        
    }
    public boolean checkRow(int rowNum, int val)
    {
        
        switch (rowNum){
            case 1: return (row1[val] == 0);
            case 2: return (row2[val] == 0);
            case 3: return (row3[val] == 0);
            case 4: return (row4[val] == 0);
            case 5: return (row5[val] == 0);
            case 6: return (row6[val] == 0);
            case 7: return (row7[val] == 0);
            case 8: return (row8[val] == 0);
            case 9: return (row9[val] == 0);
            }
        return 1==1;
                
        
        
    }
    
    public void setValue(int rowNum, int val)
    {
        switch (rowNum){
            case 1: row1[val] = 1;
                    break;
            case 2: row2[val] = 1;
                    break;
            case 3: row3[val] = 1;
                    break;
            case 4: row4[val] = 1;
                    break;
            case 5: row5[val] = 1;
                    break;
            case 6: row6[val] = 1;
                    break;
            case 7: row7[val] = 1;
                    break;
            case 8: row8[val] = 1;
                    break;
            case 9: row9[val] = 1;
                    break;
            }
    }
    public void remValue(int rowNum, int val)
    {
        switch (rowNum){
            case 1: row1[val] = 0;
                    break;
            case 2: row2[val] = 0;
                    break;
            case 3: row3[val] = 0;
                    break;
            case 4: row4[val] = 0;
                    break;
            case 5: row5[val] = 0;
                    break;
            case 6: row6[val] = 0;
                    break;
            case 7: row7[val] = 0;
                    break;
            case 8: row8[val] = 0;
                    break;
            case 9: row9[val] = 0;
                    break;
            }
    }
}
