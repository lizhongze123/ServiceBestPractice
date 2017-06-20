package com.example.lzz.servicebestpractice;

/**
 * Created by lzz on 2017/6/20.
 */

public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();

}
