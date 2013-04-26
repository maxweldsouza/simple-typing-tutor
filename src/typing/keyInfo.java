/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typing;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Main
 */
public class keyInfo {

    char key;
    ArrayList<Long> correctHistory = new ArrayList<Long>();
    Row row;
    boolean IsSymbol;

    public keyInfo(char key, Row row, boolean IsSymbol) {
        this.key = key;
        this.row = row;
        this.IsSymbol = IsSymbol;
        correctHistory.add(Long.MAX_VALUE);
    }

    public char getKey() {
        return key;
    }

    public boolean checkKey(char value, long elapsedTime) {
        if (key == value) {
            correctHistory.add(0, elapsedTime);
            return true;
        } else {
            return false;
        }
    }
}

enum Row {

    Number,
    Top,
    Middle,
    Bottom
}
