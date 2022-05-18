package com.bing.lan.easy.kuaisu.bean;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by oopcoder at 2022/5/18 21:52 .
 */

@Data
@Getter
@Setter
@EqualsAndHashCode
public class Account {
  @ExcelProperty("账号类型")
  private int accountType;
  @ExcelProperty("公司名称")
  private String companyName;
  @ExcelProperty("人民币金额")
  private double cnyBalance;
  @ExcelProperty("人民币冻结金额")
  private double cnyFreezeBalance;
  @ExcelProperty("美元金额")
  private double usdBalance;
  @ExcelProperty("美元冻结金额")
  private double usdFreezeBalance;
  @ExcelProperty("账号id")
  private int accountId;
  @ExcelProperty("公司id")
  private int companyId;
}
