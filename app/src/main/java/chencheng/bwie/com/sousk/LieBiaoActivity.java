package chencheng.bwie.com.sousk;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LieBiaoActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mInfoShowType;
    /**
     * 综合
     */
    private TextView mInfoTvZhonghe;
    /**
     * 销量
     */
    private TextView mInfoTvXiaoliang;
    /**
     * 价格
     */
    private TextView mInfoTvPrice;
    /**
     * 筛选
     */
    private TextView mInfoTvShaixuan;
    private RecyclerView mInfoRv;
    private SwipeRefreshLayout mInfoSrl;

    private String page = "1";
    private String sort = "0";

    private boolean type = true;
    private ImageView mDetailsReturn;
    private EditText mSelectEtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lie_biao);

        initView();
    }

    private void initView() {
        mInfoShowType = (ImageView) findViewById(R.id.info_show_type);
        mInfoShowType.setOnClickListener(this);
        mInfoTvZhonghe = (TextView) findViewById(R.id.info_tvZhonghe);
        mInfoTvXiaoliang = (TextView) findViewById(R.id.info_tvXiaoliang);
        mInfoTvPrice = (TextView) findViewById(R.id.info_tvPrice);
        mInfoTvShaixuan = (TextView) findViewById(R.id.info_tvShaixuan);
        mInfoRv = (RecyclerView) findViewById(R.id.info_rv);
        mInfoSrl = (SwipeRefreshLayout) findViewById(R.id.info_srl);
        mDetailsReturn = (ImageView) findViewById(R.id.details_return);
        mDetailsReturn.setOnClickListener(this);
        mSelectEtName = (EditText) findViewById(R.id.selectEtName);
        mSelectEtName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.info_show_type:

                break;
            case R.id.details_return:
                this.finish();
                break;
            case R.id.selectEtName:

                break;
        }
    }



}
