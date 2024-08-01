const message = document.getElementById('message');

const client = new Client({
    brokerURL: 'ws://localhost:8080/websocket',
    onConnect: () => {
        console.log('connected...');
        // 구독용. 메세지를 수신
        client.subscribe('/topic/{userId}', message =>
            console.log(`Received: ${message.body}`)
        );
        // 발행. 메세지를 전달
        client.publish({
            destination: '/app/{userId}',
            body: JSON.stringify({
            message: message.value})
        });
    }
});
client.activate();

