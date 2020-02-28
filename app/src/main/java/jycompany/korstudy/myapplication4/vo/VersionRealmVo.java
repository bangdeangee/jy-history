package jycompany.korstudy.myapplication4.vo;

import io.realm.RealmObject;

public class VersionRealmVo extends RealmObject {
    String version;

    public VersionRealmVo() {

    }

    public VersionRealmVo(String version) {
        this.version = version;

    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}