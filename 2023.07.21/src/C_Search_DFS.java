
public class C_Search_DFS {
	public static void main(String[] args) {
		// 1. 깊이 우선 탐색(DFS : Depth-First Search)
		// 시작 노드에서 출발해 한 분기의 최대 깊이ㅣ까지 탐색을 마치고,
		// 다른 분기로 이동하여 다시 탐색을 수행하는 알고리즘

		// 노드 수가 N 개, 엣지 수가 E 개일 때
		// 시간 복잡도는 O( V + E )

		// 구현 간 재귀 함수를 이용하므로 stack overflow를 주의하여야 한다.

		// 한 번 방문한 노드는 재방문해선 안 되기에, 방문 여부를 체크할 배열이 필요하다.
		// DFS 탐색 방식은 후입 선출 특성을 지니고 있으므로, 스택과 연계하여 사용 가능하다.

//		1 -> 2 -> 5
//		|	   \
//		3 -> 4 -> 6
//		
//		구조 : 			1
//					2		3
//				5			4
//						6
		
	}
}