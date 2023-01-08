package class_19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class VerticalOrderTraversal {
	class Point {
		Node root;
		int x;
		int y;
		public Point(Node root, int x, int y) {
			this.root = root;
			this.x = x;
			this.y = y;
		}
	}

	public List<List<Integer>> verticalTraversal(Node root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}

		Map<Integer, PriorityQueue<Point>> map = new HashMap<>();
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(root, 0, 0));
		Comparator<Point> comparator = (a, b) -> {
			if (a.y == b.y) {
				return a.root.data - b.root.data;
			} else {
				return a.y - b.y;
			}
		};

		int minIdx = 0;
		int maxIdx = 0;
		while (!queue.isEmpty()) {
			Point point = queue.poll();
			root = point.root;
			map.putIfAbsent(point.x, new PriorityQueue<>(comparator));
			map.get(point.x).add(point);
			minIdx = Math.min(minIdx, point.x);
			maxIdx = Math.max(maxIdx, point.x);
			if (root.left != null)  queue.offer(new Point(root.left, point.x - 1, point.y + 1));
			if (root.right != null) queue.offer(new Point(root.right, point.x + 1, point.y + 1));
		}

		for (int i = minIdx; i <= maxIdx; i++) {
			PriorityQueue<Point> heap = map.get(i);
			List<Integer> list = new ArrayList<>();
			while (!heap.isEmpty()) {
				list.add(heap.poll().root.data);
			}
			res.add(list);
		}
		return res;
	  }
}
