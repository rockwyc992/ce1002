package ce1002.a5.s102502044;

class Swordsman extends Hero {

    //姓名初始化
    Swordsman() {
        name = "Swordsman";
    }

    //getter override
    double health_point() {
        return health_point * 0.1;
    }

    double magic_point() {
        return magic_point * 0.1;
    }

    double power_point() {
        return power_point * 0.8;
    }

}

