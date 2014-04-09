package ce1002.a5.s102502044;

class Knight extends Hero {

    //姓名初始化
    Knight() {
        name = "Knight";
    }
    
    //getter override
    double health_point() {
        return health_point * 0.8;
    }

    double magic_point() {
        return magic_point * 0.1;
    }

    double power_point() {
        return power_point * 0.1;
    }

}

