/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

/**
 *
 * @author Nick
 */
public class SudokuWindow extends javax.swing.JFrame {

    /**
     * Creates new form SudokuWindow
     */
    private int value[] = new int [82];
    
    public SudokuWindow() {
        initComponents();
        this.setTitle("Sudoku Solver");
    }
    
    public int[] returnValues() {
        return value;
        }
    
    public void setTime(long elapsed){
        
        jTextFieldTime.setText(Long.toString(elapsed));
        
    }
    public void setValue(int value,int position)
    {
        switch(position){
            case 1:
                if(value == 0)
                {
                    jTextField1.setText(String.valueOf(""));
                }
                else
                {
                    jTextField1.setText(Integer.toString(value));
                }
                break;
            case 2:
                if(value == 0)
                {
                    jTextField2.setText(String.valueOf(""));
                }
                else
                {
                    jTextField2.setText(Integer.toString(value));
                }
                break;
            case 3:
                if(value == 0)
                {
                    jTextField3.setText(String.valueOf(""));
                }
                else
                {
                    jTextField3.setText(Integer.toString(value));
                }
                break;
            case 4:
                if(value == 0)
                {
                    jTextField4.setText(String.valueOf(""));
                }
                else
                {
                    jTextField4.setText(Integer.toString(value));
                }
                break;
            case 5:
                if(value == 0)
                {
                    jTextField5.setText(String.valueOf(""));
                }
                else
                {
                    jTextField5.setText(Integer.toString(value));
                }
                break;
            case 6:
                if(value == 0)
                {
                    jTextField6.setText(String.valueOf(""));
                }
                else
                {
                    jTextField6.setText(Integer.toString(value));
                }
                break;
            case 7:
                if(value == 0)
                {
                    jTextField7.setText(String.valueOf(""));
                }
                else
                {
                    jTextField7.setText(Integer.toString(value));
                }
                break;
            case 8:
                if(value == 0)
                {
                    jTextField8.setText(String.valueOf(""));
                }
                else
                {
                    jTextField8.setText(Integer.toString(value));
                }
                break;
            case 9:
                if(value == 0)
                {
                    jTextField9.setText(String.valueOf(""));
                }
                else
                {
                    jTextField9.setText(Integer.toString(value));
                }
                break;
            case 10:
                if(value == 0)
                {
                    jTextField10.setText(String.valueOf(""));
                }
                else
                {
                    jTextField10.setText(Integer.toString(value));
                }
                break;
            case 11:
                if(value == 0)
                {
                    jTextField11.setText(String.valueOf(""));
                }
                else
                {
                    jTextField11.setText(Integer.toString(value));
                }
                break;
            case 12:
                if(value == 0)
                {
                    jTextField12.setText(String.valueOf(""));
                }
                else
                {
                    jTextField12.setText(Integer.toString(value));
                }
                break;
            case 13:
                if(value == 0)
                {
                    jTextField13.setText(String.valueOf(""));
                }
                else
                {
                    jTextField13.setText(Integer.toString(value));
                }
                break;
            case 14:
                if(value == 0)
                {
                    jTextField14.setText(String.valueOf(""));
                }
                else
                {
                    jTextField14.setText(Integer.toString(value));
                }
                break;
            case 15:
                if(value == 0)
                {
                    jTextField15.setText(String.valueOf(""));
                }
                else
                {
                    jTextField15.setText(Integer.toString(value));
                }
                break;
            case 16:
                if(value == 0)
                {
                    jTextField16.setText(String.valueOf(""));
                }
                else
                {
                    jTextField16.setText(Integer.toString(value));
                }
                break;
            case 17:
                if(value == 0)
                {
                    jTextField17.setText(String.valueOf(""));
                }
                else
                {
                    jTextField17.setText(Integer.toString(value));
                }
                break;
            case 18:
                if(value == 0)
                {
                    jTextField18.setText(String.valueOf(""));
                }
                else
                {
                    jTextField18.setText(Integer.toString(value));
                }
                break;
            case 19:
                if(value == 0)
                {
                    jTextField19.setText(String.valueOf(""));
                }
                else
                {
                    jTextField19.setText(Integer.toString(value));
                }
                break;
            case 20:
                if(value == 0)
                {
                    jTextField20.setText(String.valueOf(""));
                }
                else
                {
                    jTextField20.setText(Integer.toString(value));
                }
                break;
            case 21:
                if(value == 0)
                {
                    jTextField21.setText(String.valueOf(""));
                }
                else
                {
                    jTextField21.setText(Integer.toString(value));
                }
                break;
            case 22:
                if(value == 0)
                {
                    jTextField22.setText(String.valueOf(""));
                }
                else
                {
                    jTextField22.setText(Integer.toString(value));
                }
                break;
            case 23:
                if(value == 0)
                {
                    jTextField23.setText(String.valueOf(""));
                }
                else
                {
                    jTextField23.setText(Integer.toString(value));
                }
                break;
            case 24:
                if(value == 0)
                {
                    jTextField24.setText(String.valueOf(""));
                }
                else
                {
                    jTextField24.setText(Integer.toString(value));
                }
                break;
            case 25:
                if(value == 0)
                {
                    jTextField25.setText(String.valueOf(""));
                }
                else
                {
                    jTextField25.setText(Integer.toString(value));
                }
                break;
            case 26:
                if(value == 0)
                {
                    jTextField26.setText(String.valueOf(""));
                }
                else
                {
                    jTextField26.setText(Integer.toString(value));
                }
                break;
            case 27:
                if(value == 0)
                {
                    jTextField27.setText(String.valueOf(""));
                }
                else
                {
                    jTextField27.setText(Integer.toString(value));
                }
                break;
            case 28:
                if(value == 0)
                {
                    jTextField28.setText(String.valueOf(""));
                }
                else
                {
                    jTextField28.setText(Integer.toString(value));
                }
                break;
            case 29:
                if(value == 0)
                {
                    jTextField29.setText(String.valueOf(""));
                }
                else
                {
                    jTextField29.setText(Integer.toString(value));
                }
                break;
            case 30:
                if(value == 0)
                {
                    jTextField30.setText(String.valueOf(""));
                }
                else
                {
                    jTextField30.setText(Integer.toString(value));
                }
                break;
            case 31:
                if(value == 0)
                {
                    jTextField31.setText(String.valueOf(""));
                }
                else
                {
                    jTextField31.setText(Integer.toString(value));
                }
                break;
            case 32:
                if(value == 0)
                {
                    jTextField32.setText(String.valueOf(""));
                }
                else
                {
                    jTextField32.setText(Integer.toString(value));
                }
                break;
            case 33:
                if(value == 0)
                {
                    jTextField33.setText(String.valueOf(""));
                }
                else
                {
                    jTextField33.setText(Integer.toString(value));
                }
                break;
            case 34:
                if(value == 0)
                {
                    jTextField34.setText(String.valueOf(""));
                }
                else
                {
                    jTextField34.setText(Integer.toString(value));
                }
                break;
            case 35:
                if(value == 0)
                {
                    jTextField35.setText(String.valueOf(""));
                }
                else
                {
                    jTextField35.setText(Integer.toString(value));
                }
                break;
            case 36:
                if(value == 0)
                {
                    jTextField36.setText(String.valueOf(""));
                }
                else
                {
                    jTextField36.setText(Integer.toString(value));
                }
                break;
            case 37:
                if(value == 0)
                {
                    jTextField37.setText(String.valueOf(""));
                }
                else
                {
                    jTextField37.setText(Integer.toString(value));
                }
                break;
            case 38:
                if(value == 0)
                {
                    jTextField38.setText(String.valueOf(""));
                }
                else
                {
                    jTextField38.setText(Integer.toString(value));
                }
                break;
            case 39:
                if(value == 0)
                {
                    jTextField39.setText(String.valueOf(""));
                }
                else
                {
                    jTextField39.setText(Integer.toString(value));
                }
                break;
            case 40:
                if(value == 0)
                {
                    jTextField40.setText(String.valueOf(""));
                }
                else
                {
                    jTextField40.setText(Integer.toString(value));
                }
                break;
            case 41:
                if(value == 0)
                {
                    jTextField41.setText(String.valueOf(""));
                }
                else
                {
                    jTextField41.setText(Integer.toString(value));
                }
                break;
            case 42:
                if(value == 0)
                {
                    jTextField42.setText(String.valueOf(""));
                }
                else
                {
                    jTextField42.setText(Integer.toString(value));
                }
                break;
            case 43:
                if(value == 0)
                {
                    jTextField43.setText(String.valueOf(""));
                }
                else
                {
                    jTextField43.setText(Integer.toString(value));
                }
                break;
            case 44:
                if(value == 0)
                {
                    jTextField44.setText(String.valueOf(""));
                }
                else
                {
                    jTextField44.setText(Integer.toString(value));
                }
                break;
            case 45:
                if(value == 0)
                {
                    jTextField45.setText(String.valueOf(""));
                }
                else
                {
                    jTextField45.setText(Integer.toString(value));
                }
                break;
            case 46:
                if(value == 0)
                {
                    jTextField46.setText(String.valueOf(""));
                }
                else
                {
                    jTextField46.setText(Integer.toString(value));
                }
                break;
            case 47:
                if(value == 0)
                {
                    jTextField47.setText(String.valueOf(""));
                }
                else
                {
                    jTextField47.setText(Integer.toString(value));
                }
                break;
            case 48:
                if(value == 0)
                {
                    jTextField48.setText(String.valueOf(""));
                }
                else
                {
                    jTextField48.setText(Integer.toString(value));
                }
                break;
            case 49:
                if(value == 0)
                {
                    jTextField49.setText(String.valueOf(""));
                }
                else
                {
                    jTextField49.setText(Integer.toString(value));
                }
                break;
            case 50:
                if(value == 0)
                {
                    jTextField50.setText(String.valueOf(""));
                }
                else
                {
                    jTextField50.setText(Integer.toString(value));
                }
                break;
            case 51:
                if(value == 0)
                {
                    jTextField51.setText(String.valueOf(""));
                }
                else
                {
                    jTextField51.setText(Integer.toString(value));
                }
                break;
            case 52:
                if(value == 0)
                {
                    jTextField52.setText(String.valueOf(""));
                }
                else
                {
                    jTextField52.setText(Integer.toString(value));
                }
                break;
            case 53:
                if(value == 0)
                {
                    jTextField53.setText(String.valueOf(""));
                }
                else
                {
                    jTextField53.setText(Integer.toString(value));
                }
                break;
            case 54:
                if(value == 0)
                {
                    jTextField54.setText(String.valueOf(""));
                }
                else
                {
                    jTextField54.setText(Integer.toString(value));
                }
                break;
            case 55:
                if(value == 0)
                {
                    jTextField55.setText(String.valueOf(""));
                }
                else
                {
                    jTextField55.setText(Integer.toString(value));
                }
                break;
            case 56:
                if(value == 0)
                {
                    jTextField56.setText(String.valueOf(""));
                }
                else
                {
                    jTextField56.setText(Integer.toString(value));
                }
                break;
            case 57:
                if(value == 0)
                {
                    jTextField57.setText(String.valueOf(""));
                }
                else
                {
                    jTextField57.setText(Integer.toString(value));
                }
                break;
            case 58:
                if(value == 0)
                {
                    jTextField58.setText(String.valueOf(""));
                }
                else
                {
                    jTextField58.setText(Integer.toString(value));
                }
                break;
            case 59:
                if(value == 0)
                {
                    jTextField59.setText(String.valueOf(""));
                }
                else
                {
                    jTextField59.setText(Integer.toString(value));
                }
                break;
            case 60:
                if(value == 0)
                {
                    jTextField60.setText(String.valueOf(""));
                }
                else
                {
                    jTextField60.setText(Integer.toString(value));
                }
                break;
            case 61:
                if(value == 0)
                {
                    jTextField61.setText(String.valueOf(""));
                }
                else
                {
                    jTextField61.setText(Integer.toString(value));
                }
                break;
            case 62:
                if(value == 0)
                {
                    jTextField62.setText(String.valueOf(""));
                }
                else
                {
                    jTextField62.setText(Integer.toString(value));
                }
                break;
            case 63:
                if(value == 0)
                {
                    jTextField63.setText(String.valueOf(""));
                }
                else
                {
                    jTextField63.setText(Integer.toString(value));
                }
                break;
            case 64:
                if(value == 0)
                {
                    jTextField64.setText(String.valueOf(""));
                }
                else
                {
                    jTextField64.setText(Integer.toString(value));
                }
                break;
            case 65:
                if(value == 0)
                {
                    jTextField65.setText(String.valueOf(""));
                }
                else
                {
                    jTextField65.setText(Integer.toString(value));
                }
                break;
            case 66:
                if(value == 0)
                {
                    jTextField66.setText(String.valueOf(""));
                }
                else
                {
                    jTextField66.setText(Integer.toString(value));
                }
                break;
            case 67:
                if(value == 0)
                {
                    jTextField67.setText(String.valueOf(""));
                }
                else
                {
                    jTextField67.setText(Integer.toString(value));
                }
                break;
            case 68:
                if(value == 0)
                {
                    jTextField68.setText(String.valueOf(""));
                }
                else
                {
                    jTextField68.setText(Integer.toString(value));
                }
                break;
            case 69:
                if(value == 0)
                {
                    jTextField69.setText(String.valueOf(""));
                }
                else
                {
                    jTextField69.setText(Integer.toString(value));
                }
                break;
            case 70:
                if(value == 0)
                {
                    jTextField70.setText(String.valueOf(""));
                }
                else
                {
                    jTextField70.setText(Integer.toString(value));
                }
                break;
            case 71:
                if(value == 0)
                {
                    jTextField71.setText(String.valueOf(""));
                }
                else
                {
                    jTextField71.setText(Integer.toString(value));
                }
                break;
            case 72:
                if(value == 0)
                {
                    jTextField72.setText(String.valueOf(""));
                }
                else
                {
                    jTextField72.setText(Integer.toString(value));
                }
                break;
            case 73:
                if(value == 0)
                {
                    jTextField73.setText(String.valueOf(""));
                }
                else
                {
                    jTextField73.setText(Integer.toString(value));
                }
                break;
            case 74:
                if(value == 0)
                {
                    jTextField74.setText(String.valueOf(""));
                }
                else
                {
                    jTextField74.setText(Integer.toString(value));
                }
                break;
            case 75:
                if(value == 0)
                {
                    jTextField75.setText(String.valueOf(""));
                }
                else
                {
                    jTextField75.setText(Integer.toString(value));
                }
                break;
            case 76:
                if(value == 0)
                {
                    jTextField76.setText(String.valueOf(""));
                }
                else
                {
                    jTextField76.setText(Integer.toString(value));
                }
                break;
            case 77:
                if(value == 0)
                {
                    jTextField77.setText(String.valueOf(""));
                }
                else
                {
                    jTextField77.setText(Integer.toString(value));
                }
                break;
            case 78:
                if(value == 0)
                {
                    jTextField78.setText(String.valueOf(""));
                }
                else
                {
                    jTextField78.setText(Integer.toString(value));
                }
                break;
            case 79:
                if(value == 0)
                {
                    jTextField79.setText(String.valueOf(""));
                }
                else
                {
                    jTextField79.setText(Integer.toString(value));
                }
                break;
            case 80:
                if(value == 0)
                {
                    jTextField80.setText(String.valueOf(""));
                }
                else
                {
                    jTextField80.setText(Integer.toString(value));
                }
                break;
            case 81:
                if(value == 0)
                {
                    jTextField81.setText(String.valueOf(""));
                }
                else
                {
                    jTextField81.setText(Integer.toString(value));
                }
                break;
             
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jFrame1 = new javax.swing.JFrame();
        textArea1 = new java.awt.TextArea();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        Solve = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jTextField81 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        Reset = new javax.swing.JButton();
        jTextFieldTime = new javax.swing.JTextField();

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame2Layout = new org.jdesktop.layout.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame3Layout = new org.jdesktop.layout.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame4Layout = new org.jdesktop.layout.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Solve.setText("Solve");
        Solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolveActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jTextField19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jTextField11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jTextField20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jTextField21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(layout.createSequentialGroup()
                                .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jTextField22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jTextField13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jTextField25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(jTextField16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jTextField17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jTextField18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator2)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                                .add(jTextField55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jTextField64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jTextField73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jSeparator11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(12, 12, 12)
                                            .add(Reset, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                                .add(layout.createSequentialGroup()
                                                    .add(jTextField67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                    .add(jTextField69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jSeparator10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(Solve, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(jTextFieldTime)))
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jTextField28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jTextField37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jTextField46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jSeparator12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(layout.createSequentialGroup()
                                            .add(jTextField34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jTextField36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jSeparator1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(jTextField10)
                            .add(jTextField11)
                            .add(jTextField12)
                            .add(jTextField13)
                            .add(jTextField14)
                            .add(jTextField15)
                            .add(jTextField16)
                            .add(jTextField17)
                            .add(jTextField18)
                            .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField44, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField52, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jTextField55, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField58, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jTextField64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jTextField61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jTextField70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jTextField72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jTextField73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField77, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jSeparator11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSeparator10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Solve)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jTextFieldTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(Reset))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolveActionPerformed
        
       value[0] = 1;
        
       if(jTextField1.getText().equals("")) {
           value[1] = 0;
       }
       else {
           value[1] = Integer.parseInt(jTextField1.getText());
       }
       if(jTextField2.getText().equals("")) {
           value[2] = 0;
       }
       else {
           value[2] = Integer.parseInt(jTextField2.getText());
       }
       if(jTextField3.getText().equals("")) {
           value[3] = 0;
       }
       else {
           value[3] = Integer.parseInt(jTextField3.getText());
       }
       if(jTextField4.getText().equals("")) {
           value[4] = 0;
       }
       else {
           value[4] = Integer.parseInt(jTextField4.getText());
       }
       if(jTextField5.getText().equals("")) {
           value[5] = 0;
       }
       else {
           value[5] = Integer.parseInt(jTextField5.getText());
       }
       if(jTextField6.getText().equals("")) {
           value[6] = 0;
       }
       else {
           value[6] = Integer.parseInt(jTextField6.getText());
       }
       if(jTextField7.getText().equals("")) {
           value[7] = 0;
       }
       else {
           value[7] = Integer.parseInt(jTextField7.getText());
       }
       if(jTextField8.getText().equals("")) {
           value[8] = 0;
       }
       else {
           value[8] = Integer.parseInt(jTextField8.getText());
       }
       if(jTextField9.getText().equals("")) {
           value[9] = 0;
       }
       else {
           value[9] = Integer.parseInt(jTextField9.getText());
       }
       if(jTextField10.getText().equals("")) {
           value[10] = 0;
       }
       else {
           value[10] = Integer.parseInt(jTextField10.getText());
       }
       if(jTextField11.getText().equals("")) {
           value[11] = 0;
       }
       else {
           value[11] = Integer.parseInt(jTextField11.getText());
       }
       if(jTextField12.getText().equals("")) {
           value[12] = 0;
       }
       else {
           value[12] = Integer.parseInt(jTextField12.getText());
       }
       if(jTextField13.getText().equals("")) {
           value[13] = 0;
       }
       else {
           value[13] = Integer.parseInt(jTextField13.getText());
       }
       if(jTextField14.getText().equals("")) {
           value[14] = 0;
       }
       else {
           value[14] = Integer.parseInt(jTextField14.getText());
       }
       if(jTextField15.getText().equals("")) {
           value[15] = 0;
       }
       else {
           value[15] = Integer.parseInt(jTextField15.getText());
       }
       if(jTextField16.getText().equals("")) {
           value[16] = 0;
       }
       else {
           value[16] = Integer.parseInt(jTextField16.getText());
       }
       if(jTextField17.getText().equals("")) {
           value[17] = 0;
       }
       else {
           value[17] = Integer.parseInt(jTextField17.getText());
       }
       if(jTextField18.getText().equals("")) {
           value[18] = 0;
       }
       else {
           value[18] = Integer.parseInt(jTextField18.getText());
       }
       if(jTextField19.getText().equals("")) {
           value[19] = 0;
       }
       else {
           value[19] = Integer.parseInt(jTextField19.getText());
       }
       if(jTextField20.getText().equals("")) {
           value[20] = 0;
       }
       else {
           value[20] = Integer.parseInt(jTextField20.getText());
       }
       if(jTextField21.getText().equals("")) {
           value[21] = 0;
       }
       else {
           value[21] = Integer.parseInt(jTextField21.getText());
       }
       if(jTextField22.getText().equals("")) {
           value[22] = 0;
       }
       else {
           value[22] = Integer.parseInt(jTextField22.getText());
       }
       if(jTextField23.getText().equals("")) {
           value[23] = 0;
       }
       else {
           value[23] = Integer.parseInt(jTextField23.getText());
       }
       if(jTextField24.getText().equals("")) {
           value[24] = 0;
       }
       else {
           value[24] = Integer.parseInt(jTextField24.getText());
       }
       if(jTextField25.getText().equals("")) {
           value[25] = 0;
       }
       else {
           value[25] = Integer.parseInt(jTextField25.getText());
       }
       if(jTextField26.getText().equals("")) {
           value[26] = 0;
       }
       else {
           value[26] = Integer.parseInt(jTextField26.getText());
       }
       if(jTextField27.getText().equals("")) {
           value[27] = 0;
       }
       else {
           value[27] = Integer.parseInt(jTextField27.getText());
       }
       if(jTextField28.getText().equals("")) {
           value[28] = 0;
       }
       else {
           value[28] = Integer.parseInt(jTextField28.getText());
       }
       if(jTextField29.getText().equals("")) {
           value[29] = 0;
       }
       else {
           value[29] = Integer.parseInt(jTextField29.getText());
       }
       if(jTextField30.getText().equals("")) {
           value[30] = 0;
       }
       else {
           value[30] = Integer.parseInt(jTextField30.getText());
       }
       if(jTextField31.getText().equals("")) {
           value[31] = 0;
       }
       else {
           value[31] = Integer.parseInt(jTextField31.getText());
       }
       if(jTextField32.getText().equals("")) {
           value[32] = 0;
       }
       else {
           value[32] = Integer.parseInt(jTextField32.getText());
       }
       if(jTextField33.getText().equals("")) {
           value[33] = 0;
       }
       else {
           value[33] = Integer.parseInt(jTextField33.getText());
       }
       if(jTextField34.getText().equals("")) {
           value[34] = 0;
       }
       else {
           value[34] = Integer.parseInt(jTextField34.getText());
       }
       if(jTextField35.getText().equals("")) {
           value[35] = 0;
       }
       else {
           value[35] = Integer.parseInt(jTextField35.getText());
       }
       if(jTextField36.getText().equals("")) {
           value[36] = 0;
       }
       else {
           value[36] = Integer.parseInt(jTextField36.getText());
       }
       if(jTextField37.getText().equals("")) {
           value[37] = 0;
       }
       else {
           value[37] = Integer.parseInt(jTextField37.getText());
       }
       if(jTextField38.getText().equals("")) {
           value[38] = 0;
       }
       else {
           value[38] = Integer.parseInt(jTextField38.getText());
       }
       if(jTextField39.getText().equals("")) {
           value[39] = 0;
       }
       else {
           value[39] = Integer.parseInt(jTextField39.getText());
       }
       if(jTextField40.getText().equals("")) {
           value[40] = 0;
       }
       else {
           value[40] = Integer.parseInt(jTextField40.getText());
       }
       if(jTextField41.getText().equals("")) {
           value[41] = 0;
       }
       else {
           value[41] = Integer.parseInt(jTextField41.getText());
       }
       if(jTextField42.getText().equals("")) {
           value[42] = 0;
       }
       else {
           value[42] = Integer.parseInt(jTextField42.getText());
       }
       if(jTextField43.getText().equals("")) {
           value[43] = 0;
       }
       else {
           value[43] = Integer.parseInt(jTextField43.getText());
       }
       if(jTextField44.getText().equals("")) {
           value[44] = 0;
       }
       else {
           value[44] = Integer.parseInt(jTextField44.getText());
       }
       if(jTextField45.getText().equals("")) {
           value[45] = 0;
       }
       else {
           value[45] = Integer.parseInt(jTextField45.getText());
       }
       if(jTextField46.getText().equals("")) {
           value[46] = 0;
       }
       else {
           value[46] = Integer.parseInt(jTextField46.getText());
       }
       if(jTextField47.getText().equals("")) {
           value[47] = 0;
       }
       else {
           value[47] = Integer.parseInt(jTextField47.getText());
       }
       if(jTextField48.getText().equals("")) {
           value[48] = 0;
       }
       else {
           value[48] = Integer.parseInt(jTextField48.getText());
       }
       if(jTextField49.getText().equals("")) {
           value[49] = 0;
       }
       else {
           value[49] = Integer.parseInt(jTextField49.getText());
       }
       if(jTextField50.getText().equals("")) {
           value[50] = 0;
       }
       else {
           value[50] = Integer.parseInt(jTextField50.getText());
       }
       if(jTextField51.getText().equals("")) {
           value[51] = 0;
       }
       else {
           value[51] = Integer.parseInt(jTextField51.getText());
       }
       if(jTextField52.getText().equals("")) {
           value[52] = 0;
       }
       else {
           value[52] = Integer.parseInt(jTextField52.getText());
       }
       if(jTextField53.getText().equals("")) {
           value[53] = 0;
       }
       else {
           value[53] = Integer.parseInt(jTextField53.getText());
       }
       if(jTextField54.getText().equals("")) {
           value[54] = 0;
       }
       else {
           value[54] = Integer.parseInt(jTextField54.getText());
       }
       if(jTextField55.getText().equals("")) {
           value[55] = 0;
       }
       else {
           value[55] = Integer.parseInt(jTextField55.getText());
       }
       if(jTextField56.getText().equals("")) {
           value[56] = 0;
       }
       else {
           value[56] = Integer.parseInt(jTextField56.getText());
       }
       if(jTextField57.getText().equals("")) {
           value[57] = 0;
       }
       else {
           value[57] = Integer.parseInt(jTextField57.getText());
       }
       if(jTextField58.getText().equals("")) {
           value[58] = 0;
       }
       else {
           value[58] = Integer.parseInt(jTextField58.getText());
       }
       if(jTextField59.getText().equals("")) {
           value[59] = 0;
       }
       else {
           value[59] = Integer.parseInt(jTextField59.getText());
       }
       if(jTextField60.getText().equals("")) {
           value[60] = 0;
       }
       else {
           value[60] = Integer.parseInt(jTextField60.getText());
       }
       if(jTextField61.getText().equals("")) {
           value[61] = 0;
       }
       else {
           value[61] = Integer.parseInt(jTextField61.getText());
       }
       if(jTextField62.getText().equals("")) {
           value[62] = 0;
       }
       else {
           value[62] = Integer.parseInt(jTextField62.getText());
       }
       if(jTextField63.getText().equals("")) {
           value[63] = 0;
       }
       else {
           value[63] = Integer.parseInt(jTextField63.getText());
       }
       if(jTextField64.getText().equals("")) {
           value[64] = 0;
       }
       else {
           value[64] = Integer.parseInt(jTextField64.getText());
       }
       if(jTextField65.getText().equals("")) {
           value[65] = 0;
       }
       else {
           value[65] = Integer.parseInt(jTextField65.getText());
       }
       if(jTextField66.getText().equals("")) {
           value[66] = 0;
       }
       else {
           value[66] = Integer.parseInt(jTextField66.getText());
       }
       if(jTextField67.getText().equals("")) {
           value[67] = 0;
       }
       else {
           value[67] = Integer.parseInt(jTextField67.getText());
       }
       if(jTextField68.getText().equals("")) {
           value[68] = 0;
       }
       else {
           value[68] = Integer.parseInt(jTextField68.getText());
       }
       if(jTextField69.getText().equals("")) {
           value[69] = 0;
       }
       else {
           value[69] = Integer.parseInt(jTextField69.getText());
       }
       if(jTextField70.getText().equals("")) {
           value[70] = 0;
       }
       else {
           value[70] = Integer.parseInt(jTextField70.getText());
       }
       if(jTextField71.getText().equals("")) {
           value[71] = 0;
       }
       else {
           value[71] = Integer.parseInt(jTextField71.getText());
       }
       if(jTextField72.getText().equals("")) {
           value[72] = 0;
       }
       else {
           value[72] = Integer.parseInt(jTextField72.getText());
       }
       if(jTextField73.getText().equals("")) {
           value[73] = 0;
       }
       else {
           value[73] = Integer.parseInt(jTextField73.getText());
       }
       if(jTextField74.getText().equals("")) {
           value[74] = 0;
       }
       else {
           value[74] = Integer.parseInt(jTextField74.getText());
       }
       if(jTextField75.getText().equals("")) {
           value[75] = 0;
       }
       else {
           value[75] = Integer.parseInt(jTextField75.getText());
       }
       if(jTextField76.getText().equals("")) {
           value[76] = 0;
       }
       else {
           value[76] = Integer.parseInt(jTextField76.getText());
       }
       if(jTextField77.getText().equals("")) {
           value[77] = 0;
       }
       else {
           value[77] = Integer.parseInt(jTextField77.getText());
       }
       if(jTextField78.getText().equals("")) {
           value[78] = 0;
       }
       else {
           value[78] = Integer.parseInt(jTextField78.getText());
       }
       if(jTextField79.getText().equals("")) {
           value[79] = 0;
       }
       else {
           value[79] = Integer.parseInt(jTextField79.getText());
       }
       if(jTextField80.getText().equals("")) {
           value[80] = 0;
       }
       else {
           value[80] = Integer.parseInt(jTextField80.getText());
       }
       if(jTextField81.getText().equals("")) {
           value[81] = 0;
       }
       else {
           value[81] = Integer.parseInt(jTextField81.getText());
       }
          
       
       
       synchronized(this){
           this.notify();
       }
       
    }//GEN-LAST:event_SolveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        value[0] = 0;
        jTextFieldTime.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField42.setText("");
        jTextField43.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField46.setText("");
        jTextField47.setText("");
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField50.setText("");
        jTextField51.setText("");
        jTextField52.setText("");
        jTextField53.setText("");
        jTextField54.setText("");
        jTextField55.setText("");
        jTextField56.setText("");
        jTextField57.setText("");
        jTextField58.setText("");
        jTextField59.setText("");
        jTextField60.setText("");
        jTextField61.setText("");
        jTextField62.setText("");
        jTextField63.setText("");
        jTextField64.setText("");
        jTextField65.setText("");
        jTextField66.setText("");
        jTextField67.setText("");
        jTextField68.setText("");
        jTextField69.setText("");
        jTextField70.setText("");
        jTextField71.setText("");
        jTextField72.setText("");
        jTextField73.setText("");
        jTextField74.setText("");
        jTextField75.setText("");
        jTextField76.setText("");
        jTextField77.setText("");
        jTextField78.setText("");
        jTextField79.setText("");
        jTextField80.setText("");
        jTextField81.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton Solve;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField81;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldTime;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
