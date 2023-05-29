package com.src.practise.ooc_mybatis_connectivity;

/**
 * @author caojianbang
 * @date 2020/9/27 14:45
 */
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    //插入用户
    public void testInsertUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TMember tMember= new TMember();
        tMember.setName("孙尚香");
        tMember.setPassword("刘备");
        //执行插入语句
        //statement：表示那个操作，值为Mapper xml的namespace.具体操作的id，
        // 如需要调用UserMapper.xml中的insertUser操作，
        // 这个值就是：com.javacode2018.chat02.UserMapper.insertUser
        sqlSession.insert("com.src.practise.ooc_mybatis_connectivity.TMemberMapper.insertSelective",tMember);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
    //根据id查找用户
    public void testGetUserById() throws IOException {

        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
        //查找配置文件,创建输入流
        InputStream inputStream = Resources.getResourceAsStream("mybatis_study/mybatis_config.xml");
        //加载配置文件,创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sfb.build(inputStream);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询,参数一:要查询的statementId,参数二:sql语句入参
        TMember tMember= sqlSession.selectOne("tMember.getUserById", 1);
        //输入查询结果
        System.out.println(tMember);
        //释放资源
        sqlSession.close();
    }

    //根据用户名查找用户列表
    public void testGetUserByName(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<TMember> list = sqlSession.selectList("TMember.getUserByName", "张");
        for (TMember tMember : list) {
            System.out.println(tMember);
        }

        sqlSession.close();
    }

    //Mysql自增返回
    public void testInsertUserKey(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TMember tMember= new TMember();
        tMember.setName("孙尚香");
        tMember.setPassword("刘备");
        //执行插入语句
        sqlSession.insert("tMember.insertUserKey", tMember);
        System.out.println(tMember);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //Mysql的uuid返回主键
    //注：在使用uuid之前数据库user表要先加上uuid2字段、user的pojo也要加上相应属性
    public void testInsertUserUUID(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TMember tMember= new TMember();
        tMember.setName("孙尚香");
        tMember.setPassword("刘备");
        //执行插入语句
        sqlSession.insert("tMember.insertUserUUID", tMember);
        System.out.println(tMember);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //修改用户
    public void testUpdateUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TMember tMember= new TMember();
        tMember.setName("孙尚香");
        tMember.setPassword("刘备");
        //执行插入语句
        sqlSession.update("user.updateUser",tMember);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //删除用户
    public void testDeleteUser(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("tMember.deleteUser",32);
        sqlSession.commit();
        sqlSession.close();
    }
}