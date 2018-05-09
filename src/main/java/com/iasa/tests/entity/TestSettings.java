package com.iasa.tests.entity;

import javax.persistence.*;

@Entity
public class TestSettings {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @OneToMany
    private Long testSettingId;
    private Long timeSettings;
    private boolean securitySettings;
    private boolean showAnsw;
    private String help;
    private boolean showRules;

    protected TestSettings() {}

    public TestSettings(Long timeSettings, boolean securitySettings, boolean showAnsw, String help, boolean showRules) {
        this.timeSettings = timeSettings;
        this.securitySettings = securitySettings;
        this.showAnsw = showAnsw;
        this.help = help;
        this.showRules = showRules;
    }
}
