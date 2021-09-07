# AndroidBluetoothChatApp

1.2.0 About Project
With the development of digital technologies in recent decades, there has been drastic change in the mode of communication and usages of digital accessories in our today lives.
Bluetooth based chatting system using android ABSTRACT Communication is very important between the people in all areas, why because through communication we can share knowledge, exchange ideas, chat with friends etc.
Communication plays vital role in any situation to full fill our needs/tasks. Present communication Medias are computer, mobile phones, pager, etc. Now a days we are using Mobile phones to send SMS and chatting with friends for this if we want to send a message to any one we are depending on service providers like AIRTEL, VODAFONE, IDEA and many more for this message every one charging some amount but with the help of blue we can send message through our mobile phone without depending on any service provider for this reason we can send messages at free of cost. 
In this Project we developed a chat application with using Bluetooth we can connect two or more mobiles and chat with any people at a time. This application is used to chat with single person or more than two persons mean group chat also available in this application. Bluetooth chatting is an innovative approach to the mobile world. This application shows use of Bluetooth in terms of chatting. Means persons can chat via Bluetooth. 
     With the development of digital technologies in recent decades, there has been drastic    change in the mode of communication and usages of digital accessories in our today lives.
The main aim of this design is to build Bluetooth chat android app, who are within Bluetooth range, without having access to Wi-Fi or Internet users can send free message.
A two-way ,sending and receiving, text chat program for any device, i.e. phones , powered by Google’s Android operating system . All it needs is two Bluetooth compatible Android devices in range of about 5 feet of each other.

1.2.1 Bluetooth
![image](https://user-images.githubusercontent.com/69396799/132393907-bab66dbb-3314-4f0f-a302-514f5bd98dbf.png)

Bluetooth is a wireless communication technology that enables the wireless transmission of data over short distances. Bluetooth can communicate with 2.4 GHz using radio frequencies. Bluetooth technology can reach up to 10 meters of shooting capacity in an open area. Data transfer speeds between 1 Mbps and 721 Kbps are achieved in transfers with Bluetooth.

Android OS supports networking via Bluetooth. It transfers data between devices using wireless communication.

By using Android Bluetooth APIs, we can easily access Bluetooth related functions.

It allows to connect to other devices using the Bluetooth API.

What can we do using Bluetooth APIs?
* Scan for other Bluetooth devices
* Questioning Bluetooth devices paired with the device
* Transferring data with other devices
* Connecting to other devices with services
* Managing multiple wireless connections



1.2.2 	Requirement Analysis
HARDWARE REQUIREMENTS:
1. System Model-Acer Nitro AN515-42
2.HardDisk- 1TB
3.Ram- 8.00 GB (6.90 GB usable)
4.Gpu- Radeon Vega Mobile Gfx 2.00 GHz
5.Processor- AMD Ryzen 5 2500U
SOFTWARE REQUIREMENTS:
1.OperatingSystem-Windows 10
2.CodingLanguage-Java8
3.FrameWork/ToolKit-Android 4.2.1
4.IDE-InteliJ

1.2.3 [image](https://user-images.githubusercontent.com/69396799/132394993-dea1963e-53b3-40f8-baa2-2a6a249670b6.png)
These are all the requirements used in the Android Manifest File who aim is :describes essential information about your app to the Android build tools, the Android operating system, and Google Play.In this project we have used these:-
1."android.permission.BLUETOOTH“:
includes support for the Bluetooth network stack, which allows a device to wirelessly exchange data with other Bluetooth devices.
2."android.permission.BLUETOOTH_ADMIN“:this is an android manifest permission and its parent class is java.lanag.Object 
3."android.permission.ACCESS_FINE_LOCATION“:more like a connection request provide better connection.























SUMMARY
The primary need for the Android Bluetooth chat is to enable communication within 10 metres without the use of Wifi. This is useful when individuals have to communicate confidential information between each other in an hospital when their is no wifi,cellular network available and they cant use voices or sounds.
The application is implemented as a two stage process as a server-client socket communication The application is launched and a permission is requested to turn on Bluetooth. After Bluetooth is turned on, the client device will discover devices that have Bluetooth turned on and are displayed in a list. When a device is tapped , the tapped device acts as the server and connection is established between Client and Server. The important aspect of this stage of the process is that the device that is going to be part of this connection should have the application launched and it will discover devices. Once the connection is initiated the Chat window opens in both Client and Server devices. 
