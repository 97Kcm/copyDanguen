const message = document.getElementById('message');
const sendMessage = document.getElementById('send-message');
const chatInfo = document.getElementById('chat-info');
const boardNo = document.getElementById('board-no');
const myNickname = document.getElementById('myNickname');
const chatArea = document.getElementById('chat-area');
const myId = document.getElementById('my-id');
const otherId = document.getElementById('otherId');
const myProfile = document.getElementById('my-profile');
const otherProfile = document.getElementById('other-profile');

/*************************************************/

const client = new StompJs.Client({
    brokerURL: 'ws://localhost:8080/websocket',
    onConnect: () => {
        console.log('connected...');
        console.log(boardNo.value);

        // client.subscribe('/topic/' + boardNo.value + "/list", message => {
        //     try{
        //         loadChat(message)
        //     }catch (error){
        //         console.error('Error parsing message body:', error);
        //     }
        // });


        client.subscribe('/topic/' + boardNo.value, message => {
            console.log(`Received: ${message.body}`);
            try {
                // 메시지 body를 JSON으로 파싱
                const data = JSON.parse(message.body);
                console.log(data);
                showChat(data);
            } catch (error) {
                console.error('Error parsing message body:', error);
            }
        });

    }
});

sendMessage.addEventListener('click', () => {
    if(message.value.trim() !== ''){
        client.publish({
            destination: '/app/'+boardNo.value,
            body: JSON.stringify({
                boardNo: boardNo.value,
                id: myId.value,
                nickname: myNickname.value,
                message: message.value,
                skipContentLengthHeader: true
            })
        });

        message.value = '';
    }

});



client.activate();

function showChat(data){
    if(data.id === myId.value){
        chatArea.insertAdjacentHTML('beforeend',`
                    <section>
                        <div class="opponent-chat">
                            <span>${data.nowDate}</span>
                            <div class="message">${data.message}</div>
                            <div class="profile">
                                <img src="${myProfile.value}" alt="또또">
                            </div>
                        </div>
                    </section>
        `)
    }else if(data.id !== myId.value){
        chatArea.insertAdjacentHTML(`beforeend`,`
                    <section>
                        <div class="my-chat">
                            <div class="profile">
                                <img src="${otherProfile.value}" alt="또또">
                            </div>
                            <div class="message">${data.message}</div>
                            <span>${data.nowDate}</span>
                        </div>
                    </section>
        `)
    }
}

// function loadChat(message){
//     if(message.body !== null){
//         chatArea.innerHTML = "";
//         var chatListArray = JSON.parse(message.body);
//         for (let i = 0; i < chatListArray.length; i++) {
//             if(chatListArray[i].id === myId.value){
//                 chatArea.insertAdjacentHTML('beforeend',`<div class="opponent-chat">
//                     <span>${chatListArray[i].nowDate}</span>
//                     <div class="message">${chatListArray[i].message}</div>
//                     <div class="profile">
//                         <img src="${myProfile.value}" alt="또또">
//                     </div>
//                 </div>`)
//             }else if(chatListArray[i].id === otherId.value){
//                 chatArea.insertAdjacentHTML('beforeend',`
//                             <div class="my-chat">
//                     <div class="profile">
//                         <img alt="또또" src="${otherProfile.value}">
//                     </div>
//                     <div class="message">${chatListArray[i].message}</div>
//                     <span>${chatListArray[i].nowDate}</span>
//                 </div>
//                             `)
//             }
//         }
//     }
// }