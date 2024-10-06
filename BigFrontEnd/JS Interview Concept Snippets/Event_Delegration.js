// Event Delegation Example

const div = document.getElementById("div");

div.addEventListener("click", (event) => {
  const target = event.target;

  if (target.tagName === "BUTTON") {
    console.log(target.innerHTML);
  }
});