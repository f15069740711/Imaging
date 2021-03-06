package com.jtech.imaging.cache;

import android.content.Context;

import com.jtech.imaging.JApplication;
import com.jtech.imaging.common.Constants;
import com.jtech.imaging.model.OauthModel;
import com.jtechlib.cache.BaseCacheManager;

/**
 * 授权认证信息对象缓存管理
 * Created by jianghan on 2016/9/21.
 */
public class OauthCache extends BaseCacheManager {
    private static OauthCache INSTANCE;

    private OauthModel oauthModel;

    public OauthCache(Context context) {
        super(context);
    }

    public static OauthCache get() {
        if (null == INSTANCE) {
            INSTANCE = new OauthCache(JApplication.getInstance());
        }
        return INSTANCE;
    }

    /**
     * 是否存在授权信息
     *
     * @return
     */
    public static boolean hasOauthModel() {
        return null != OauthCache.get().getOauthModel();
    }

    /**
     * 设置授权认证数据对象
     *
     * @param oauthModel
     * @return
     */
    public boolean setOauthModel(OauthModel oauthModel) {
        this.oauthModel = oauthModel;
        return insert(OauthModel.class.getSimpleName(), oauthModel);
    }

    /**
     * 获取授权认证数据对象
     *
     * @return
     */
    public OauthModel getOauthModel() {
        if (null == oauthModel) {
            oauthModel = queryObject(OauthModel.class.getSimpleName());
        }
        return oauthModel;
    }

    @Override
    public String getCacheName() {
        return Constants.CACHE_NAME;
    }
}