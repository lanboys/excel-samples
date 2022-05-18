package com.bing.lan.easy;

/**
 * Created by oopcoder at 2022/5/18 22:27 .
 */

public class Log {

  public void info(String tag) {
    System.out.println(tag);
  }

  public void info(String tag, Object content) {
    System.out.println(tag + ": " + content);
  }
}
