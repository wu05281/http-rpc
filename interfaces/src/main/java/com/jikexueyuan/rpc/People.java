package com.jikexueyuan.rpc;

import java.io.Serializable;

/**
 * Created by version_z on 2015/8/22.
 */
public class People  implements  Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8111873398898246350L;

	private Integer age;

    private Integer sex;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
