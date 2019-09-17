# 知识图谱的可视化及问答系统

## 项目简介
本项目使用Java编程语言Springboot编程框架，以web的形式实现了知识图谱可视化以及问答系统。<br>
知识图谱可视化使用的是ECharts框架，具有界面简洁接口调用方便等特征。<br>
数据库采用的图数据库neo4j，由于数据的保密性，故数据库没有上传至github。<br>
图数据库中仅有两种关系类型，即“取证”、“拥有”。用户可自行模拟数据。<br>

## 知识图谱可视化
首先进入登录界面<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E7%99%BB%E5%BD%95.png)

首页<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E9%A6%96%E9%A1%B5.png)

进入知识图谱界面<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E5%9B%BE%E8%B0%B11.png)

搜索“取证航母”<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E5%9B%BE%E8%B0%B12.png)

右击可以显示卡片<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E5%9B%BE%E8%B0%B13.png)

双击可以进入下一层推理<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E5%9B%BE%E8%B0%B14.png)

## 问答系统
针对图数据中的实体、属性、关系三种类型进行问答<br>
![image](https://github.com/DefuLi/Knowledge-Graph/blob/master/qa_system/%E6%88%AA%E5%9B%BE/%E5%9B%BE%E8%B0%B17.png)

## 注意事项
本项目的数据无法开源，如有需要请自行建库。<br>
下载本程序后，请解压qa_system文件夹中的src和target两个压缩包，放在qa_system文件夹即可。<br>
