/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nick
 */
public class Block {
    private int[] blo1 = new int[11];
    private int[] blo2 = new int[11];
    private int[] blo3 = new int[11];
    private int[] blo4 = new int[11];
    private int[] blo5 = new int[11];
    private int[] blo6 = new int[11];
    private int[] blo7 = new int[11];
    private int[] blo8 = new int[11];
    private int[] blo9 = new int[11];
    
    public Block(int bloNum[], int val[])
    {
        for(int temp = 1; temp < 82; temp++)
        {
            switch (bloNum[temp]){
                case 1: blo1[val[temp]] = 1;
                        break;
                case 2: blo2[val[temp]] = 1;
                        break;
                case 3: blo3[val[temp]] = 1;
                        break;
                case 4: blo4[val[temp]] = 1;
                        break;
                case 5: blo5[val[temp]] = 1;
                        break;
                case 6: blo6[val[temp]] = 1;
                        break;
                case 7: blo7[val[temp]] = 1;
                        break;
                case 8: blo8[val[temp]] = 1;
                        break;
                case 9: blo9[val[temp]] = 1;
                        break;
            }
                
        }
        
        
        
    }
    public boolean checkBlo(int bloNum, int val)
    {
        
        switch (bloNum){
            case 1: return (blo1[val] == 0);
            case 2: return (blo2[val] == 0);
            case 3: return (blo3[val] == 0);
            case 4: return (blo4[val] == 0);
            case 5: return (blo5[val] == 0);
            case 6: return (blo6[val] == 0);
            case 7: return (blo7[val] == 0);
            case 8: return (blo8[val] == 0);
            case 9: return (blo9[val] == 0);
            }
                
        return 1==1;
        
    }
    
    public void setValue(int bloNum, int val)
    {
        switch (bloNum){
            case 1: blo1[val] = 1;
                    break;
            case 2: blo2[val] = 1;
                    break;
            case 3: blo3[val] = 1;
                    break;
            case 4: blo4[val] = 1;
                    break;
            case 5: blo5[val] = 1;
                    break;
            case 6: blo6[val] = 1;
                    break;
            case 7: blo7[val] = 1;
                    break;
            case 8: blo8[val] = 1;
                    break;
            case 9: blo9[val] = 1;
                    break;
            }
    }
    public void remValue(int bloNum, int val)
    {
        switch (bloNum){
            case 1: blo1[val] = 0;
                    break;
            case 2: blo2[val] = 0;
                    break;
            case 3: blo3[val] = 0;
                    break;
            case 4: blo4[val] = 0;
                    break;
            case 5: blo5[val] = 0;
                    break;
            case 6: blo6[val] = 0;
                    break;
            case 7: blo7[val] = 0;
                    break;
            case 8: blo8[val] = 0;
                    break;
            case 9: blo9[val] = 0;
                    break;
            }
    }
}

