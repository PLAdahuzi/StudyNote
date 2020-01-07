package com.wechat.service.addressbook;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * [简要描述]:计算list集合的大小（单位：字节）
 * [详细描述]:<br/>
 *
 * @author mjye
 * @version 1.0, 2018年9月1日
 * @since JDK1.8
 */
public class CountSize
{

    public void countListSize(List<Object> list)
    {
        try
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(baos);

            os.writeObject(list);
            os.close();
            System.out.println("字节数：" + baos.size());

            baos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
