/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typing;

import java.util.Comparator;

/**
 *
 * @author Main
 */
public class keyInfoComparator implements Comparator<keyInfo> {

    public int compare(keyInfo key1, keyInfo key2) {
        int key1total = 0;
        int key2total = 0;
        if (key1.correctHistory.get(0) - key2.correctHistory.get(0) > 0) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
