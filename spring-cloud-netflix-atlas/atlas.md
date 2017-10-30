## atlas
本文主要介绍如何使用atlas进行数据监控

1.首先我们需要下载：
    1. memory.conf
    2. atlas.jar
    3.publish-test.sh
    
    
2.运行
 
  1. java -jar atlas-1.4.5-standalone.jar memory.conf
  2. 启动本项目的main方法
  3. ./publish-test.sh


3.结果查看
http://localhost:7101/api/v1/graph?q=name,randomValue,:eq,:sum,(,name,),:by