    // 우선 컨텍스트를 가져옵니다. 
    var ctx = document.getElementById("myChart").getContext('2d');
    var ctx2 = document.getElementById("myChart2").getContext('2d');
    var ctx3 = document.getElementById("myChart3").getContext('2d');
    var ctx4 = document.getElementById("myChart4").getContext('2d');
    var ctx5 = document.getElementById("myChart5").getContext('2d');
    var ctx6 = document.getElementById("myChart6").getContext('2d');
    var ctx7 = document.getElementById("myChart7").getContext('2d');

    /*
    - Chart를 생성하면서, 
    - ctx를 첫번째 argument로 넘겨주고, 
    - 두번째 argument로 그림을 그릴때 필요한 요소들을 모두 넘겨줍니다. 
    */
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: ["폐업신고율", "평균 폐업기간(년)", "평균 매장 증감율(년)"],
            datasets: [{
                label: danger,
                data: [close, remain_Term, plma],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    console.log(move_info)
    console.log(pie_values)
    console.log(stay_info[2])
    var myChart2 = new Chart(ctx2, {
        type: 'pie',

        data: {
            labels: pie_keys,
            datasets: [{
                data: pie_values,
                backgroundColor: [
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }
            ]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }]
            },
        }
    });

    var myChart3 = new Chart(ctx3, {
        type: 'bar',
        data: {
            labels: ['총상주/직장인구', '남성_total', '여성_total', '20대_total', '30대_total', '40대_total', '50대_total', '60대_total', '남성_20', '남성_30', '남성_40', '남성_50', '남성_60', '여성_20', '여성_30', '여성_40', '여성_50', '여성_60'],
            datasets: [{
                label: '상주인구',
                data: [stay_info[2], stay_info[3], stay_info[4], stay_info[5], stay_info[6], stay_info[7], stay_info[8], stay_info[9], stay_info[10], stay_info[11], stay_info[12], stay_info[13], stay_info[14], stay_info[15], stay_info[16], stay_info[17], stay_info[18], stay_info[19]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            },
            {
                label: '직장인구',
                data: [move_info[2], move_info[3], move_info[4], move_info[5], move_info[6], move_info[7], move_info[8], move_info[9], move_info[10], move_info[11], move_info[12], move_info[13], move_info[14], move_info[15], move_info[16], move_info[17], move_info[18], move_info[19]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)',
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)',
                    'rgba(255, 206, 86, 1)',
                    'rgba(75, 192, 192, 1)',
                    'rgba(153, 102, 255, 1)',
                    'rgba(255, 159, 64, 1)'
                ],
                borderWidth: 1
            }
            ]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 30,
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    console.log(sales_info[3])
    console.log(sales_info)
    var myChart4 = new Chart(ctx4, {
        type: 'pie',
        data: {
            labels: ["남성", "여성"],
            datasets: [{
                label: sales_info[1] + '의' + sales_info[2] + '매출 남/녀 비율',
                data: [sales_info[12], sales_info[13]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 30,
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    var myChart5 = new Chart(ctx5,
        {
            type: 'pie',
            data: {
                labels: ["아침(06:00 - 11:00)", "점심 시간대(11:00 - 17:00)", "저녁 및 야식 시간대(17:00 - 06:00)"],
                datasets: [{
                    label: "구간별 매출 비율",
                    data: [sales_info[9], sales_info[10], sales_info[11]],
                    backgroundColor: [
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(153, 102, 255, 1)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(153, 102, 255, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                tooltips: {
                    titleFontSize: 30,
                    bodyFontSize: 30
                },
                maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
                scales: {
                    yAxes: [{
                        ticks: {
                            fontSize: 25,
                            beginAtZero: true
                        }
                    }],
                    xAxes: [{
                        ticks: {
                            fontSize: 25,
                            beginAtZero: true
                        }
                    }]
                },
            }
        });
    var myChart6 = new Chart(ctx6, {
        type: 'pie',
        data: {
            labels: ["주중", "주말"],
            datasets: [{
                label: "주중/말 매출 비율",
                data: [sales_info[5], sales_info[6]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    var myChart7 = new Chart(ctx7, {
        type: 'bar',
        data: {
            labels: ['월 매출', '월 매출 건수'],
            datasets: [{
                label: '건당 평균 매출:' + sales_info[3] / sales_info[4],
                data: [sales_info[3], stay_info[4]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            }
            ]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }],
                xAxes: [{
                    ticks: {
                        fontSize: 25,
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    var myChart5 = new Chart(ctx5,
        {
            type: 'pie',
            data: {
                labels: ["아침(06:00 - 11:00)", "점심 시간대(11:00 - 17:00)", "저녁 및 야식 시간대(17:00 - 06:00)"],
                datasets: [{
                    label: "구간별 매출 비율",
                    data: [sales_info[9], sales_info[10], sales_info[11]],
                    backgroundColor: [
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(153, 102, 255, 1)'
                    ],
                    borderColor: [
                        'rgba(255,99,132,1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(153, 102, 255, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                tooltips: {
                    titleFontSize: 30,
                    bodyFontSize: 30
                },
                maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
                scales: {
                    yAxes: [{
                        ticks: {
                            beginAtZero: true
                        }
                    }]
                },
            }
        });
    var myChart6 = new Chart(ctx6, {
        type: 'pie',
        data: {
            labels: ["주중", "주말"],
            datasets: [{
                label: "주중/말 매출 비율",
                data: [sales_info[5], sales_info[6]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            }]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });
    var myChart7 = new Chart(ctx7, {
        type: 'bar',
        data: {
            labels: ['월 매출', '월 매출 건수'],
            datasets: [{
                label: '건당 평균 매출:' + sales_info[3] / sales_info[4],
                data: [sales_info[3], stay_info[4]],
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)'
                ],
                borderColor: [
                    'rgba(255,99,132,1)',
                    'rgba(54, 162, 235, 1)'
                ],
                borderWidth: 1
            }
            ]
        },
        options: {
            tooltips: {
                titleFontSize: 30,
                bodyFontSize: 30
            },
            maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            },
        }
    });