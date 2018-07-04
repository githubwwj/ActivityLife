package com.activity.life;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/16 0016.
 */

public class User1 implements Serializable {

    private static final long serialVersionUID = 939932734127366414L;

    public int userId;
    public String name;
    public boolean isMale;

    public User1(int userId, String name, boolean isMale) {
        this.userId = userId;
        this.name = name;
        this.isMale = isMale;
    }
}
