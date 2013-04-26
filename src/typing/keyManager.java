/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package typing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Main
 */
public class keyManager {
    
    int i = 0;
    int size = 0;
    ArrayList<keyInfo> keys = new ArrayList<keyInfo>();
    
    public keyManager() {
    }
    
    public boolean NoKeysSelected() {
        return keys.size() == 0;
    }
    
    public keyInfo nextKey() {
        //Initially size is 0
        //So loop through the entire collection once
            System.out.println("Size:" + size);
        if (size == 0) {
            size = keys.size();
        }
        
        //iterate through size
        if (i < size) {
            int value = i;
            i++;
            System.out.println(value);
            return keys.get(value);
        }
        
        //After iterating throught size
        //Double the size of the collection that is looped
        //If it cannot be double iterate throught the whole collection
        //After iterating through the whole collection set size back to 1
        int doubleSize = size * 2;
        if (doubleSize < keys.size()) {
            size = doubleSize;
        } else if (size == keys.size()) {
            size = 1;
        } else {
            size = keys.size();
        }
        i = 0;
        sortKeys();
//        for (keyInfo key : keys) {
//            System.out.println(key.getKey());
//        }
        return nextKey();
    }
    
    private void sortKeys() {
        keyInfoComparator comparator = new keyInfoComparator();
        Collections.sort(keys, comparator);
    }
    
    public void shuffleKeys() {
        java.util.Random random = new Random();
        for (keyInfo key : keys) {
            key.checkKey(key.getKey(), random.nextLong());
        }
        sortKeys();
    }
    
    public void generateKeys(boolean bnumber, boolean btop, boolean bmiddle,
            boolean bbottom, boolean bsymbols, boolean bshift, boolean bchars) {
        keys.clear();
        if (btop && bchars) {
            genTop();
        }
        if (bmiddle && bchars) {
            genMiddle();
        }
        if (bbottom && bchars) {
            genBottom();
        }
        if (bnumber && bchars) {
            genNumber();
        }
        if (btop && bsymbols) {
            genTopSym();
        }
        if (bmiddle && bsymbols) {
            genMiddleSym();
        }
        if (bbottom && bsymbols) {
            genBottomSym();
        }
        if (bnumber && bsymbols) {
            genNumberSym();
        }
        if (btop && bshift && bchars) {
            genTopShift();
        }
        if (bmiddle && bshift && bchars) {
            genMiddleShift();
        }
        if (bbottom && bshift && bchars) {
            genBottomShift();
        }
        if (btop && bshift && bsymbols) {
            genTopSymShift();
        }
        if (bmiddle && bshift && bsymbols) {
            genMiddleSymShift();
        }
        if (bbottom && bshift && bsymbols) {
            genBottomSymShift();
        }
        if (bnumber && bshift && bsymbols) {
            genNumberSymShift();
        }
    }
    
    private void genTop() {
        char[] top = "qwertyuiop".toCharArray();
        for (char val : top) {
            keyInfo key = new keyInfo(val, Row.Top, false);
            keys.add(key);
        }
    }
    
    private void genMiddle() {
        char[] middle = "asdfghjkl".toCharArray();
        for (char val : middle) {
            keyInfo key = new keyInfo(val, Row.Middle, false);
            keys.add(key);
        }
    }
    
    private void genBottom() {
        char[] bottom = "zxcvbnm".toCharArray();
        for (char val : bottom) {
            keyInfo key = new keyInfo(val, Row.Bottom, false);
            keys.add(key);
        }
    }
    
    private void genNumber() {
        char[] numbers = "1234567890".toCharArray();
        for (char val : numbers) {
            keyInfo key = new keyInfo(val, Row.Number, false);
            keys.add(key);
        }
    }
    
    private void genTopSym() {
        char[] topSymbols = "[]\\".toCharArray();
        for (char val : topSymbols) {
            keyInfo key = new keyInfo(val, Row.Top, true);
            keys.add(key);
        }
    }
    
    private void genMiddleSym() {
        char[] middleSymbols = ";'".toCharArray();
        for (char val : middleSymbols) {
            keyInfo key = new keyInfo(val, Row.Middle, true);
            keys.add(key);
        }
    }
    
    private void genBottomSym() {
        char[] bottomSymbols = ",./".toCharArray();
        for (char val : bottomSymbols) {
            keyInfo key = new keyInfo(val, Row.Bottom, true);
            keys.add(key);
        }
    }
    
    private void genNumberSym() {
        char[] numberSymbols = "`-=".toCharArray();
        for (char val : numberSymbols) {
            keyInfo key = new keyInfo(val, Row.Number, true);
            keys.add(key);
        }
    }
    
    private void genTopShift() {
        char[] top = "QWERTYUIOP".toCharArray();
        for (char val : top) {
            keyInfo key = new keyInfo(val, Row.Top, false);
            keys.add(key);
        }
    }
    
    private void genMiddleShift() {
        char[] middle = "ASDFGHJKL".toCharArray();
        for (char val : middle) {
            keyInfo key = new keyInfo(val, Row.Middle, false);
            keys.add(key);
        }
    }
    
    private void genBottomShift() {
        char[] bottom = "ZXCVBNM".toCharArray();
        for (char val : bottom) {
            keyInfo key = new keyInfo(val, Row.Bottom, false);
            keys.add(key);
        }
    }
    
    private void genTopSymShift() {
        char[] topSymbols = "{}|".toCharArray();
        for (char val : topSymbols) {
            keyInfo key = new keyInfo(val, Row.Top, true);
            keys.add(key);
        }
    }
    
    private void genMiddleSymShift() {
        char[] middleSymbols = ":\"".toCharArray();
        for (char val : middleSymbols) {
            keyInfo key = new keyInfo(val, Row.Middle, true);
            keys.add(key);
        }
    }
    
    private void genBottomSymShift() {
        char[] bottomSymbols = "<>?".toCharArray();
        for (char val : bottomSymbols) {
            keyInfo key = new keyInfo(val, Row.Bottom, true);
            keys.add(key);
        }
    }
    
    private void genNumberSymShift() {
        char[] numberSymbols = "`~!@#$%^&*()_+-=".toCharArray();
        for (char val : numberSymbols) {
            keyInfo key = new keyInfo(val, Row.Number, true);
            keys.add(key);
        }
    }
}
