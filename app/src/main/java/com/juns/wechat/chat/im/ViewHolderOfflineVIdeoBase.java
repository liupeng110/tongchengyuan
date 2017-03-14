package com.juns.wechat.chat.im;

import android.view.View;
import android.widget.ImageView;

import com.juns.wechat.R;
import com.juns.wechat.chat.bean.OfflineVideoMsg;
import com.juns.wechat.chat.bean.PictureMsg;
import com.juns.wechat.util.ImageLoader;
import com.juns.wechat.util.PhotoUtil;

/**
 * Created by xiajun on 2017/1/20.
 */

public class ViewHolderOfflineVideoBase extends BaseMsgViewHolder {
    protected ImageView ivPicture;
    protected OfflineVideoMsg videoMsg;

    ViewHolderOfflineVideoBase(View view) {
        super(view);
        ivPicture = (ImageView) view.findViewById(R.id.ivPicture);
    }

    @Override
    protected void updateView() {
        //先得到bean，在进行其他操作
        videoMsg = (OfflineVideoMsg) messageBean.getMsgObj();
        super.updateView();
        loadPicture(ivPicture, PhotoUtil.PHOTO_PATH + "/" + videoMsg.fileName);

    }

    private void loadPicture(ImageView imageView, String path) {
        ImageLoader.loadTriangleImage(imageView, path, isLeftLayout() ? 0 : 1);
    }
    @Override
    protected void onClickLayoutContainer(){
        super.onClickLayoutContainer();
    }
}

