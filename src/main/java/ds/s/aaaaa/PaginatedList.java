package ds.s.aaaaa;

import java.io.Serializable;
import java.util.List;


public class PaginatedList<T> implements Serializable {

	private static final long serialVersionUID = -2582060677791599460L;

	/**
	 * ��ҳ���
	 */
	private List<T> result;

	/**
	 * ��ҳ��Ϣ
	 */
	private Pagination pagination;

	/**
	 * @return the result
	 */
	public List<T> getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(List<T> result) {
		this.result = result;
	}

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination
	 *            the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

}
