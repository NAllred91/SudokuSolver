/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nick
 */
public class Col {
    private int[] col1 = new int[11];
    private int[] col2 = new int[11];
    private int[] col3 = new int[11];
    private int[] col4 = new int[11];
    private int[] col5 = new int[11];
    private int[] col6 = new int[11];
    private int[] col7 = new int[11];
    private int[] col8 = new int[11];
    private int[] col9 = new int[11];
    
    public Col(int colNum[], int val[])
    {
        for(int temp = 1; temp < 82; temp++)
        {
            switch (colNum[temp]){
                case 1: col1[val[temp]] = 1;
                        break;
                case 2: col2[val[temp]] = 1;
                        break;
                case 3: col3[val[temp]] = 1;
                        break;
                case 4: col4[val[temp]] = 1;
                        break;
                case 5: col5[val[temp]] = 1;
                        break;
                case 6: col6[val[temp]] = 1;
                        break;
                case 7: col7[val[temp]] = 1;
                        break;
                case 8: col8[val[temp]] = 1;
                        break;
                case 9: col9[val[temp]] = 1;
                        break;
            }
                
        }
        
        
        
    }
    public boolean checkCol(int colNum, int val)
    {
        
        switch (colNum){
            case 1: return (col1[val] == 0);
            case 2: return (col2[val] == 0);
            case 3: return (col3[val] == 0);
            case 4: return (col4[val] == 0);
            case 5: return (col5[val] == 0);
            case 6: return (col6[val] == 0);
            case 7: return (col7[val] == 0);
            case 8: return (col8[val] == 0);
            case 9: return (col9[val] == 0);
            }
               
        return 1==1;
        
    }
    
    public void setValue(int colNum, int val)
    {
        switch (colNum){
            case 1: col1[val] = 1;
                    break;
            case 2: col2[val] = 1;
                    break;
            case 3: col3[val] = 1;
                    break;
            case 4: col4[val] = 1;
                    break;
            case 5: col5[val] = 1;
                    break;
            case 6: col6[val] = 1;
                    break;
            case 7: col7[val] = 1;
                    break;
            case 8: col8[val] = 1;
                    break;
            case 9: col9[val] = 1;
                    break;
            }
    }
    public void remValue(int colNum, int val)
    {
        switch (colNum){
            case 1: col1[val] = 0;
                    break;
            case 2: col2[val] = 0;
                    break;
            case 3: col3[val] = 0;
                    break;
            case 4: col4[val] = 0;
                    break;
            case 5: col5[val] = 0;
                    break;
            case 6: col6[val] = 0;
                    break;
            case 7: col7[val] = 0;
                    break;
            case 8: col8[val] = 0;
                    break;
            case 9: col9[val] = 0;
                    break;
            }
    }
}
