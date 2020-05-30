package view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.factory.MockPresenterFactory;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.InjectViewStatePresenter;
import com.arellomobile.mvp.presenter.PresenterType;

import params.IncorrectParametersParams;

/**
 * Date: 24.02.2016
 * Time: 18:19
 *
 * @author Savin Mikhail
 */
public class IncorrectParametersParamsView implements MvpView, IncorrectParametersParams {
	@InjectPresenter(factory = MockPresenterFactory.class, presenterId = "Test", type = PresenterType.LOCAL)
	public InjectViewStatePresenter mInjectViewStatePresenter;

	@Override
	public void method1(final Integer i) {

	}
}
