package me.roohom.ProductDao;

import org.junit.Test;

/**
 * ClassName: ProductDaoTest
 * Author: Roohom
 * Function:
 * Date: 2020/8/8 11:27
 * Software: IntelliJ IDEA
 */
public class ProductDaoTest {
    @Test
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
