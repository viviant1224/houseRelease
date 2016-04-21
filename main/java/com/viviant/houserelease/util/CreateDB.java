package com.viviant.houserelease.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Created with IntelliJ IDEA.
 * User: viviant
 * Date: 15-4-30
 * Time: 下午4:38
 * To change this template use File | Settings | File Templates.
 */
public class CreateDB {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        //因为默认就读取是src下面文件名
        cfg.configure();

        SchemaExport export = new SchemaExport(cfg);//把cfg.xml中的数据库信息和hbm中表信息全部变成sql脚本

        export.create(true, true);
    }
}
