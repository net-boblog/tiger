package com.dianping.tiger.dispatch;

import java.util.List;

/**
 * @author yuantengkai 各自执行器捞取任务，各自分发<br/>
 *         <mail to: zjytk05@163.com/>
 */
public interface DispatchMultiService extends DispatchTaskService {

	/**
	 * 获取一定数量的任务
	 * 
	 * @param handler
	 *            执行器名称
	 * @param nodeList
	 *            任务节点
	 * @param limit
	 *            任务上限数
	 * @return
	 */
	public List<DispatchTaskEntity> findDispatchTasksWithLimit(String handler,
			List<Integer> nodeList, int limit);

	/**
	 * 反压获取一定数量的任务
	 * 
	 * @param handler
	 * @param nodeList
	 * @param limit
	 * @param taskId
	 * @return
	 */
	public List<DispatchTaskEntity> findDispatchTasksWithLimitByBackFetch(
			String handler, List<Integer> nodeList, int limit, long taskId);

}
