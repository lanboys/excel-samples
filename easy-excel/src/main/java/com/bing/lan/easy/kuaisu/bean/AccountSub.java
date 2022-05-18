package com.bing.lan.easy.kuaisu.bean;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

/**
 * Created by oopcoder at 2022/5/18 21:52 .
 */

@Data
public class AccountSub {
  @ExcelProperty("公司名称")
  private String companyName;
  @ExcelProperty("账号类型")
  private int accountType;
  @ExcelProperty("我司抬头简称")
  private String abbreviation;
  @ExcelProperty("人民币金额")
  private double cnyBalance;
  @ExcelProperty("人民币冻结金额")
  private double cnyFreezeBalance;
  @ExcelProperty("美元金额")
  private double usdBalance;
  @ExcelProperty("美元冻结金额")
  private double usdFreezeBalance;

  private int accountId;
  private int kuaisuTitleId;
}
