package com.xgwma.app.views;

import android.app.Dialog;
import android.content.Context;

/**
 *基础对话框
 */

public class BaseDialog extends Dialog {

	public BaseDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public BaseDialog(Context context, int theme) {
		super(context, theme);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 监听确定
	 */
	public abstract interface OnConfirmListener {

		public abstract void onConfirm(String result);
	}

	/**
	 * 监听取消
	 */
	public abstract interface OnCancleListener {

		public abstract void onCancle(String result);
	}
	
	/**
	 * 监听删除
	 */
	public abstract interface OnDeleteListener {

		public abstract void onDelete(String result);
	}

	/**
	 * 监听置顶
	 */
	public abstract interface OnStickListener {

		public abstract void onStick(String result);
	}

}
