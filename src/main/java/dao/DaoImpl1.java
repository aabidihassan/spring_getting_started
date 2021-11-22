package dao;

import dao.IDao;

public class DaoImpl1 implements IDao {

    @Override
    public double getTemp() {
        // depuis la base de données
        double temperature = 26;
        return temperature;
    }
    
}
