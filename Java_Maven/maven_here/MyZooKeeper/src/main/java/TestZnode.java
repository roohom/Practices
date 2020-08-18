import org.apache.curator.CuratorZookeeperClient;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * ClassName: TestZnode
 * Author: Roohom
 * Function:
 * Date: 2020/8/18 14:25
 * Software: IntelliJ IDEA
 */
public class TestZnode {
    //连接对象
    CuratorFramework client = null;

    /**
     * 获取一个连接对象的实例
     */
    @Before
    public void getConnect() {
        //总共尝试三次，每5秒重试一次
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(5000, 3);
        //构建一个客户端连接对象
        client = CuratorFrameworkFactory.newClient("192.168.88.221:2181,192.168.88.222:2181,192.168.88.223:2181", retryPolicy);
    }

    /**
     * 创建节点
     */
    @Test
    public void createZnode() {

        client.start();

        try {
            client.create().creatingParentContainersIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/bigdata/tempdata", "impala".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除节点
     */
    @Test
    public void deleteZnode() {

        client.start();

        try {
            client.delete().deletingChildrenIfNeeded().forPath("/bigdata/tempdata");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询节点
     */
    @Test
    public void getZnode() {

        client.start();

        try {
            byte[] bytes = client.getData().forPath("/bigdata");
            System.out.println(new String(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 修改节点
     */
    @Test
    public void setZnode() {

        client.start();

        try {
            client.setData().forPath("/bigdata","kylin".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 程序结束，释放连接
     */
    @After
    public void closeConnect() {
        client.close();
    }
}
