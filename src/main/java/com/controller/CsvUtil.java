package com.controller;

/**
 * Created by txw on 16/3/15.
 */

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.*;
import java.nio.charset.Charset;


public class CsvUtil {


//    public static void main(String[] args)throws Exception {
//
//
//        try {
//            String outputFile = "/Users/txw/Downloads/模版.csv";
//
//            CsvReader category = new CsvReader("/Users/txw/Downloads/类目系统数据0315.csv",',',Charset.forName("GBK"));
//            CsvReader destination = new CsvReader("/Users/txw/Downloads/生命周期与目的地关联表.csv",',',Charset.forName("GBK"));
//            CsvReader group = new CsvReader("/Users/txw/Downloads/团期与目的地关联表.csv",',',Charset.forName("GBK"));
//
//
//            category.readHeaders();
//            category.setSkipEmptyRecords(true);
//            category.setTrimWhitespace(true);
//            while (category.readRecord())
//            {
//                String tmpStr=category.getRawRecord();
//                if(!",,,,,,,,,,,,,".equals(tmpStr)) {
//                    String parentTypeId = category.get("parent_type_id");
//                    String parentTypeName = category.get("parent_type_name");
//                    String subTypeId = category.get("sub_type_id");
//                    String subTypeName = category.get("sub_type_name");
//                    String destClassId = category.get("dest_class_id");
//                    String destName = category.get("dest_name");
//                    String firstGroupId = category.get("first_group_id");
//                    String firstGroupName = category.get("first_group_name");
//                    String secondGroupId = category.get("second_group_id");
//                    String secondGroupName = category.get("second_group_name");
//                    String adId = category.get("ad_id");
//                    String adName = category.get("ad_name");
//                    String brandId = category.get("brand_id");
//                    String brandName = category.get("brand_name");
//                    destination.readHeaders();
//                    destination.setSkipEmptyRecords(true);
//                    while (destination.readRecord()) {
//
//                        String firstClassId = destination.get("一级品类id");
//                        String firstClassName = destination.get("一级品类名称");
//                        String secondClassId = destination.get("二级品类id");
//                        String secondClassName = destination.get("二级品类名称");
//                        String secondDestionId = destination.get("二级目的地id");
//                        String secondDestionName = destination.get("二级目的地名称");
//                        if (parentTypeId.equals(firstClassId) && parentTypeName.equals(firstClassName)
//                                && subTypeId.equals(secondClassId) && subTypeName.equals(secondClassName)) {
//                            group.readHeaders();
//                            group.setSkipEmptyRecords(true);
//                            while (group.readRecord()) {
//                                String secondGroupDestionId = destination.get("二级目的地id");
//                                String secondGroupDestionName = destination.get("二级目的地名称");
//                                if (secondDestionId.equals(secondGroupDestionId) && secondDestionName.equals(secondGroupDestionName)) {
//                                    boolean alreadyExists = new File(outputFile).exists();
//
//                                    try {
//                                        // use FileWriter constructor that specifies open for appending
//                                        CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
//
//                                        if (!alreadyExists) {
//                                            csvOutput.write("id");
//                                            csvOutput.write("name");
//                                            csvOutput.endRecord();
//                                        }
//
//                                        csvOutput.write("1");
//                                        csvOutput.write("Bruce");
//                                        csvOutput.endRecord();
//
//                                        csvOutput.write("2");
//                                        csvOutput.write("John");
//                                        csvOutput.endRecord();
//
//                                        csvOutput.close();
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
//                            }
//
//
//                        }
//                    }
//                }
//
//            }
//
//            category.close();
//            group.close();
//            destination.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String outputFile = "users.csv";
//
//        // before we open the file check to see if it already exists

//
//    }

//    }



}
