package com.src.practise.ood_design_pattern.ooh_composite;

/**
 *组合模式
 *
 * 学校院系的展示
 *
 *  一个学校有多个学院，一个学院有多个系
 *
 * 清华大学
 *
 *  计算机学院
 *   计算机科学与技术
 *   软件工程
 *   网络工程
 *
 *  信息工程学院
 *   通信工程
 *   信息工程
 *
 * 传统方案展示学校院系
 *
 * 学校<- 学院  <-系
 *
 * 更合适的关系是，学校包含学院，学院包含系
 * 传统方案分析
 *  1）将学院看做是学校的子类，系是学院的子类，这样实际上是
 *  按照组织大小来进行分层次的
 *  2）实际上我们要求的是，在一个页面中展示出学校的院系组成，一个
 *  学校有多个学院，一个学院有多个系，因此这种方案，很难实现管理的操作
 *  ，比如对学院、系的添加、删除、遍历等
 *  3）解决方案：将学校、院、系都看做是组织结构，他们之间没有继承的关系
 *  而是一个树形结构，可以更好实现管理操作=>组合模式
 *
 *
 *
 *  组合模式
 *
 *  基本介绍
 *  1）组合模式（Composite Pattern）又叫部分整体模式，他创建了对象组的
 *  树形结构，将对象组合成树状结构以表示“整体-部分”的层次关系。
 *  2）组合模式依据树形结构来组合对象，用来表示部分以及整体层次。
 *  3）这种类型的设计模式属于结构型设计模式
 *  4）组合模式使得用户对单个对象和组合对象的访问具有一致性，即：组合能让客户
 *  以一致的方式处理个别对象以及组合对象
 *
 *
 *  对原理类图的说明
 *  1）Component：这是组合中对象声明接口，在适当情况下，实现所有类共有的接口默认行为，
 * 用于访问和管理Component子部件，Component可以是抽象类或者接口
 * 2）Leaf:在组合中表示叶子节点，叶子节点没有子节点
 * 3）Composite:非叶子节点，用于存储部件，在Component接口中实现子部件的相关操作，
 * 比如增加（add）,删除。。
 *
 *
 * 组合模式解决的问题
 *
 * 1）组合模式解决这样的问题，当我们要处理的对象可以生成一颗树状结构，而我们
 * 要对树上的节点和叶子进行操作时，他能够提供一致的方式，而不用考虑他是节点还是叶子。
 *
 *
 *组合模式注意事项和细节
 * 1) 简化客户端操作。客户端只需要面对一致的对象而不用考虑整体部分或者节点叶子的问题。
 * 2) 具有较强的扩展性。当我们要更改组合对象时，我们只需要调整内部的层次关系，客户端不用做出任何改动.
 * 3) 方便创建出复杂的层次结构。客户端不用理会组合里面的组成细节，容易添加节点或者叶子从而创建出复杂的
 * 树形结构
 * 4) 需要遍历组织机构，或者处理的对象具有树形结构时, 非常 适合使用组合模式.
 * 5) 要求较高的抽象性，如果 节点和叶子有很多差异性的话，比如很多方法和属性都不一样 ， 不适合使用组合模式
 *
 *
 *
 *
 *

 */