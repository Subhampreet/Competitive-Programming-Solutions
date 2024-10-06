//Event Bubbling Example

const div = document.getElementById("div");
const span = document.getElementById("span");
const button = document.getElementById("button");

div.addEventListener("click", () => {
  console.log("div was clicked");
});
span.addEventListener("click", () => {
  console.log("span was clicked");
});
button.addEventListener("click", (event) => {
  //   event.stopPropagation();
  console.log("button was clicked");
});