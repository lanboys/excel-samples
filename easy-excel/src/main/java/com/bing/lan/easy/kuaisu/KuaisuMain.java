package com.bing.lan.easy.kuaisu;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import com.bing.lan.easy.Log;
import com.bing.lan.easy.kuaisu.bean.Account;
import com.bing.lan.easy.kuaisu.bean.AccountSub;
import com.bing.lan.easy.kuaisu.bean.KuaisuTitles;

import java.util.List;

/**
 * Created by oopcoder at 2022/5/18 22:40 .
 */

public class KuaisuMain {

  public static void main(String[] args) {

    String path = "G:\\kuaisu\\";

    readTitles(path + "公司抬头.xlsx");
    readAccount(path + "总账户数据.xlsx");
    readAccountSub(path + "子账户数据.xlsx");
  }

  static Log log = new Log();

  public static List<KuaisuTitles> readTitles(String fileName) {
    final List<KuaisuTitles>[] dataList = new List[]{null};
    EasyExcel.read(fileName, KuaisuTitles.class, new PageReadListener<KuaisuTitles>(data -> {
      log.info("抬头公司数据条数: ", data.size());
      dataList[0] = data;
      for (KuaisuTitles demoData : data) {
        log.info("抬头公司数据: ", JSON.toJSONString(demoData));
      }
    })).sheet().doRead();
    return dataList[0];
  }

  public static List<Account> readAccount(String fileName) {
    final List<Account>[] dataList = new List[]{null};
    EasyExcel.read(fileName, Account.class, new PageReadListener<Account>(data -> {
      log.info("总账户数据条数: ", data.size());
      dataList[0] = data;
      for (Account demoData : data) {
        log.info("总账户数据: ", JSON.toJSONString(demoData));
      }
    })).sheet().doRead();
    return dataList[0];
  }

  public static List<AccountSub> readAccountSub(String fileName) {
    final List<AccountSub>[] dataList = new List[]{null};
    EasyExcel.read(fileName, AccountSub.class, new PageReadListener<AccountSub>(data -> {
      log.info("子账户数据: ", data.size());
      dataList[0] = data;
      for (AccountSub demoData : data) {
        log.info("子账户数据: ", JSON.toJSONString(demoData));
      }
    })).sheet().doRead();

    //List<AccountSub> accountSubs = dataList[0];
    //accountSubs.stream().collect(Collectors.toCollection(new Supplier<Collection<? super AccountSub>>() {
    //  @Override
    //  public Collection<? super AccountSub> get() {
    //    return ;
    //  }
    //}));
    return dataList[0];
  }
}
