package com.bawei.day_01.sqlite;

import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.internal.DaoConfig;

public class DaoSession extends AbstractDaoSession {
    private final DaoConfig userDaoConfing;

    public DaoSession(Database db) {
        super(db);
        userDaoConfing = null;
    }

}
