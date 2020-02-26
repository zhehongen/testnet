package com.example.testnet.config;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * hibernate自动建表的编码格式
 *
 * @author yangfeng
 * @date 2018年10月22日 下午19:36:25
 * Email: Feng.Yang@things-matrix.com
 */
public class MySQL5Dialect extends MySQL5InnoDBDialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8";
    }
}
