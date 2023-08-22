
import axios from "axios";

// axios({
//     url: 'https://fix_board', // 통신할 웹문서
//     method: 'get', // 통신할 방식
//     data: { // 인자로 보낼 데이터
//
//     }
// });


function FixList() {

    fixList(() => {
        axios.get('/api/fix_board')
            .then(response => setdata(response.data))
            .catch(error => console.log(error))
    }, []);



    return (

        <tbody>
                {data.map(list => (
                    <tr>
                        <td><a th:text="${list.id}">글 ID</a></td>
                        <td><a th:text="${list.title}">제목</a></td>
                        <td th:text="${list.name}">작성자</td>
                    </tr>
                ))}
        </tbody>
    );
}

export default FixList;