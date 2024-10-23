import axios from "axios";

export default axios.create({
  baseURL: "https://63bb-196-126-86-146.ngrok-free.app",
  headers: { "ngrok-skip-browser-warning": "true" },
});
