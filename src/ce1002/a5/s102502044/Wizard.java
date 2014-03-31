package ce1002.a5.s102502044;

class Wizard extends Hero {

    //姓名初始化
    Wizard() {
        name = "Wizard";
    }

    //getter override
    double health_point() {
        return health_point * 0.2;
    }

    double magic_point() {
        return magic_point * 0.7;
    }

    double power_point() {
        return power_point * 0.1;
    }

}

