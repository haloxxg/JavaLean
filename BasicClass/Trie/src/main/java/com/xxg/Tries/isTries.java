package com.xxg.Tries;

import java.util.HashMap;

class Tries {
    private String word;
    Character a;
    HashMap<Character, Tries> children=new HashMap<Character, Tries>();

    public Tries() {
    }

    /** Initialize your data structure here. */
    public String getword() {
        return word;
    }
    private void setword(String word) {

    }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[]  values = word.toCharArray();
        HashMap<Character, Tries> maps = this.children;
        Tries tries;
        for (char a: values) {
            if(maps.get(a) == null) {
                tries = new Tries();
                maps.put(a, tries);
                maps = tries.children;
            }else {
                tries = maps.get(a);
                maps = tries.children;
            }
        }
    }
    public void traverse() {
        HashMap<Character, Tries> childs = this.children;
        for(Character key : childs.keySet()){
            System.out.println(key);
            childs.get(key).traverse();
        }
    }
}
public class isTries {
    public static void main(String[] args) {
        Tries test = new Tries();
        test.insert("hello");
        test.insert("test");
        test.insert("bad");
        test.insert("cccc");
        test.traverse();
    }
}
