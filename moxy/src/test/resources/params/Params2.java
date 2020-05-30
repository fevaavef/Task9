package params;

import com.arellomobile.mvp.ParamsProvider;
import com.arellomobile.mvp.factory.MockPresenterFactory;

/**
 * Date: 25.02.2016
 * Time: 9:21
 *
 * @author Savin Mikhail
 */
@ParamsProvider(MockPresenterFactory.class)
public interface Params2 {
	String mockParams2(String presenterId);
}
