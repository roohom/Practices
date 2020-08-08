package me.roohom.ProductDao;

import static org.junit.Assert.*;

public class ProductDaoTest {
    @org.junit.Test
    public void add() throws Exception {
        ProductDao productDao = new ProductDao();
        productDao.add();
    }

    @org.junit.Test
    public void del() throws Exception {
        ProductDao productDao = new ProductDao();
        productDao.del();
    }

    @org.junit.Test
    public void edit() throws Exception {
        ProductDao productDao = new ProductDao();
        productDao.edit();
    }

    @org.junit.Test
    public void query() throws Exception {
        ProductDao productDao = new ProductDao();
        productDao.query();
    }

}