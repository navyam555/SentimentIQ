async function analyze() {

    const text = document.getElementById("text").value;

    const response = await fetch("http://localhost:8080/api/analyze", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            text: text
        })
    });

    const data = await response.json();

    document.getElementById("result").innerText =
        "Sentiment: " + data.sentiment;
}