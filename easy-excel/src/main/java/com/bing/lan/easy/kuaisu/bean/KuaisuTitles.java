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
public class KuaisuTitles {

  @ExcelProperty("kuaisuTitleId")
  private int kuaisuTitleId;
  @ExcelProperty("kuaisuTitleName")
  private String kuaisuTitleName;
  @ExcelProperty("abbreviation")
  private String abbreviation;
}
