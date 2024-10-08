package org.howard.hrpc.config;

import lombok.Data;
import org.howard.hrpc.fault.retry.RetryStrategyKeys;
import org.howard.hrpc.fault.tolerant.TolerantStrategyKeys;
import org.howard.hrpc.loadbalancer.LoadBalancerKeys;
import org.howard.hrpc.serializer.SerializerKeys;

/**
 * RPC 框架配置选项
 *
 * @Author HowardLiu
 */
@Data
public class RpcConfig {
    /**
     * 服务名称
     */
    private String name = "h-rpc";
    /**
     * 服务版本
     */
    private String version = "1.0.0";
    /**
     * 服务主机
     */
    private String serverHost = "localhost";
    /**
     * 服务端口
     */
    private int port = 8080;
    /**
     * 是否开启 mock
     */
    private boolean mock = false;
    /**
     * 序列化器
     */
    private String serializer = SerializerKeys.JDK;
    /**
     * 注册中心配置
     */
    private RegistryConfig registryConfig = new RegistryConfig();
    /**
     * 负载均衡器
     */
    private String loadBalancer = LoadBalancerKeys.CONSISTENT_HASH;
    /**
     * 重试策略
     */
    private String retryStrategy = RetryStrategyKeys.NO;
    /**
     * 容错策略
     */
    private String tolerantStrategy = TolerantStrategyKeys.FAIL_FAST;
}
